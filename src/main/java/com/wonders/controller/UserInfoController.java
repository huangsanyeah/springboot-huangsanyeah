package com.wonders.controller;

import com.wonders.entity.PoiEntity;
import com.wonders.entity.UserInfo;
import com.wonders.service.UserInfoService;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author huangwieyue
 * @date 2018-02-13 11:48
 */
@RestController
@RequestMapping("springboot")
public class UserInfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("/getUser")
    public UserInfo getUser(Long uid){
        return userInfoService.getUser(uid);
    }

    /**
     * poi导出
     * 浏览器访问（不是接口测试，不要用postman）
     * http://localhost:8080/springboot/download
     */
    @RequestMapping("/download")
    public void downsPoiEntity(HttpServletRequest request, HttpServletResponse response)throws IOException
    {  //我这是根据前端传来的起始时间来查询数据库里的数据，如果没有输入变量要求，保留前两个就行

        String[] headers = { "ID", "姓名", "年龄"};//导出的Excel头部，这个要根据自己项目改一下

        //List dataset = userInfoService.getUser(uid);//查询出来的数据，根据自己项目改一下

        //模拟的后台查询出来的数据
        List<PoiEntity> dataset=new ArrayList<>();
        PoiEntity p1=new PoiEntity(1,"李大嘴","24");
        PoiEntity p2=new PoiEntity(2,"白展堂","32");
        dataset.add(p1);
        dataset.add(p2);
        //下面的完全不动就行了（Excel数据中不包含图片）

        // 声明一个工作薄
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 生成一个表格
        HSSFSheet sheet = workbook.createSheet();
        // 设置表格默认列宽度为15个字节
        sheet.setDefaultColumnWidth((short) 18);
        HSSFRow row = sheet.createRow(0);
        for (short i = 0; i < headers.length; i++) {
            HSSFCell cell = row.createCell(i);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }
        //遍历集合数据，产生数据行
        Iterator it = dataset.iterator();
        int index = 0;
        while (it.hasNext()) {
            index++;
            row = sheet.createRow(index);
            PoiEntity t = (PoiEntity) it.next();//自己的实体类
            //利用反射，根据javabean属性的先后顺序，动态调用getXxx()方法得到属性值
            Field[] fields = t.getClass().getDeclaredFields();
            for (short i = 0; i < fields.length; i++) {
                HSSFCell cell = row.createCell(i);
                Field field = fields[i];
                String fieldName = field.getName();
                String getMethodName = "get"
                        + fieldName.substring(0, 1).toUpperCase()
                        + fieldName.substring(1);
                try {
                    Class tCls = t.getClass();
                    Method getMethod = tCls.getMethod(getMethodName,
                            new Class[]{});
                    Object value = getMethod.invoke(t, new Object[]{});
                    String textValue = null;


                    if (value instanceof Date)
                    {
                        Date date = (Date) value;
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        textValue = sdf.format(date);
                    }
                    else
                    {
                        //其它数据类型都当作字符串简单处理
                        //解决数据库数据为空报错的问题
                        if(!(StringUtils.isEmpty(value))){
                            textValue = value.toString();
                        }else {
                            textValue="null";
                        }


                    }

                    HSSFRichTextString richString = new HSSFRichTextString(textValue);
                    HSSFFont font3 = workbook.createFont();
                    font3.setColor(HSSFColor.BLUE.index);//定义Excel数据颜色
                    richString.applyFont(font3);
                    cell.setCellValue(richString);

                } catch (SecurityException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        response.setContentType("application/octet-stream");
        //Excel名称,这种写法名称中文无法解析只能显示英文
        //response.setHeader("Content-disposition", "attachment;filename=poi.xls");
        //这种写法的导出名可以是中文
        response.setHeader("Content-disposition", "attachment;filename="+ new String("导出模板".getBytes(),"iso-8859-1") + ".xls");
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }
}
