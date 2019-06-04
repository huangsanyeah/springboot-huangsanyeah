package com.wonders.controller;

/**
 * @author huangweiyue
 * @version v1.0
 * @task
 * @description
 * @date Created in 2019-04-24
 * @modifiedBy
 */
public class ApiDoc {
    /**
     * @api {post} https://{ip}:{port}/v1.0/getPatientData   QP011 请求发送
     * @apiVersion 1.1.0
     * @apiDescription <b>【使用说明】</b>获取病人门诊、住院、日清单、体检、检验、检查数据接口调用，目前支持单个条件组查询。请求和返回需使用平台加密方式加密和解密
     * @apiName get
     * @apiGroup Data get
     * @apiParam {Json} package   请求报文
     * @apiParam {Object} head   报文头
     * @apiParam {String} [head.busseID]   业务编码
     * @apiParam {String{..64}} head.sendTradeNum   发送方交易流水号(唯一标识) 格式为：QP+当前时间戳（如：20170119145021）+八位随机数字生成
     * @apiParam {String} head.senderCode   发起方编号（分配用户名）
     * @apiParam {String} head.senderName   发起方名称（调用方公司名称）
     * @apiParam {String} [head.receiverCode]   接收方编号
     * @apiParam {String} [head.receiverName]   接收方名称
     * @apiParam {String} [head.hosorgNum]   操作员编号
     * @apiParam {String} [head.hosorgName]   操作员名称
     * @apiParam {String} [head.systemType]   系统类型
     * @apiParam {String} head.busenissType   业务类型 1:车险人伤 2:极速赔
     * @apiParam {String} [head.clientmacAddress]   客户端mac地址
     * @apiParam {Object[]} body   入参数据
     * @apiParam {String} body.hospitalId   医院ID
     * @apiParam {String{..32}} body.patientName   患者姓名
     * @apiParam {String} body.patientType   患者类型:******，6位的整数，每一位上只能为0或者1，从左至右，各位上分别表示是（1）否（0）查询住院日清单、住院已结算，门诊已结算，检验，检查，体检，。如011001表示查询住院已结算和门诊已结算和体检,100000表示查询正在住院；000000、00011X、00010X、00001X是错误的患者类型，不被接受
     * @apiParam {String} body.idCardNo   身份证号:身份证号、住院号、业务流水号、发票号、检查单号、检验单号、体检单号为关键入參，根据查询接口类型不同，至少传一个，其中：住院已结算：住院号、业务流水号、发票号、身份证号;住院日清单：住院号、身份证号;门诊已结算：业务流水号、发票号、身份证号;检验：住院号（查住院时）、检验单号、身份证号;检查：住院号（查住院时）、检查单号、身份证号;体检：体检单号、身份证号
     * @apiParam {String} body.businessTransaction   业务流水号:可用于查询对应的门诊／住院结算信息
     * @apiParam {String} body.invoiceNo   发票号:可用于查询对应的门诊／住院结算信息
     * @apiParam {String} body.hospitalizationNo   住院号:可用于查询住院相关的接口数据
     * @apiParam {String} body.examReportNo 体检单号:可用于查询对应的体检信息
     * @apiParam {String} body.testNo 检验单号:可用于查询对应的检验信息
     * @apiParam {String} body.examNo 检查单号:可以用查询对应的检查信息
     * @apiParam {String} body.startDay 开始日期，格式为"YYYY-MM-DD" 查询开始时间，门诊时间或者入院时间，必须startDay，endDay成对出现
     * @apiParam {String} body.endDay 结束日期，格式为"YYYY-MM-DD"
     * @apiParam {Object} additionInfo   报文附加信息
     * @apiParam {String} [additionInfo.errorCode]   错误代码
     * @apiParam {String} [additionInfo.errorMsg]   错误提示
     * @apiParam {String} [additionInfo.receiverTradeNum]   接收方交易流水号
     * @apiParam {String} [additionInfo.correlationId]   一串数字用于标识消息以防这条消息被修改
     * @apiParam {String} [additionInfo.asyncAsk]   用于标示是否采用异步请求机制
     * @apiParam {String} [additionInfo.callback]   异步请求后的回调地址，供平台调用返回结果报文
     * @apiParam {String} [additionInfo.curDllAddr]   异步请求后的回调地址，供动态库调用返回结果报文
     * @apiParamExample {json}       请求数据格式
     * {
     * "package": {
     * "head": {
     * "busseID": "",
     * "sendTradeNum": "QP2015070108303094671354",
     * "senderCode": "001",
     * "senderName": "消息发送者名称",
     * "receiverCode": "002",
     * "receiverName": "消息接受者的名称",
     * "hosorgNum": "001",
     * "hosorgName": "操作员姓名",
     * "systemType": "1",
     * "busenissType": "2",
     * "standardVersionCode": "version:1.1.0",
     * "clientmacAddress ": "30BB7E0A5E2D"
     * },
     * "body": [{
     * "hospitalId":"",
     * "patientName":"",
     * "patientType":"",
     * "idCardNo":"",
     * "businessTransaction":"",
     * "invoiceNo":"",
     * "hospitalizationNo":"",
     * "startDay":"",
     * "endDay":""
     * }],
     * "additionInfo": {
     * "errorCode": "",
     * "errorMsg": "",
     * "receiverTradeNum": "20150701083030100122310001",
     * "correlationId": "",
     * "asyncAsk": "0",
     * "callback": "",
     * "curDllAddr":""
     * }
     * }
     * }
     * @apiSuccess {Json} package   返回报文
     * @apiSuccess {Object} head   报文头
     * @apiSuccess {String} [head.busseID]   业务编码
     * @apiSuccess {String} head.sendTradeNum   发送方交易流水号
     * @apiSuccess {String} head.senderCode   发起方编号
     * @apiSuccess {String} head.senderName   发起方名称
     * @apiSuccess {String} [head.receiverCode]   接收方编号
     * @apiSuccess {String} [head.receiverName]   接收方名称
     * @apiSuccess {String} [head.hosorgNum]   操作员编号
     * @apiSuccess {String} [head.hosorgName]   操作员名称
     * @apiSuccess {String} [head.systemType]   系统类型
     * @apiSuccess {String} head.busenissType   业务类型 1:车险人伤 2:极速赔
     * @apiSuccess {String} [head.clientmacAddress]   客户端mac地址
     * @apiSuccess {Object[]} body   返回参数
     * @apiSuccess {Byte} body.billType          单据类型 1-门诊已结算，2-住院已结算
     * @apiSuccess {String} body.cusHosCode      医院编号
     * @apiSuccess {String} body.patientName     患者姓名
     * @apiSuccess {String} body.hospitalizationNo       住院号
     * @apiSuccess {String} body.businessTransaction          业务流水号
     * @apiSuccess {Integer} body.hospitalizationTimes    住院次数
     * @apiSuccess {String} body.receiptNo       票据号
     * @apiSuccess {String} body.invoiceNo       发票号
     * @apiSuccess {String} body.invoiceType     发票类型
     * @apiSuccess {String} body.uniInvoiceType     对码后发票类型
     * @apiSuccess {Date} body.admissionTime   入院时间/就诊时间
     * @apiSuccess {BigDecimal} body.insurePay        统筹支付金额
     * @apiSuccess {BigDecimal} body.accountPay      账户支付金额
     * @apiSuccess {BigDecimal} body.selfPay         自费金额
     * @apiSuccess {BigDecimal} body.insureSelfPay   自负金额
     * @apiSuccess {BigDecimal} body.otherPay   其他金额
     * @apiSuccess {String} body.visitNo    门诊号
     * @apiSuccess {String} body.costCategory    费用类别
     * @apiSuccess {String} body.uniCostCategory    对码后费用类别
     * @apiSuccess {BigDecimal} body.totalPay     总金额
     * @apiSuccess {Date} body.dischargeTime    出院时间
     * @apiSuccess {Date} body.settleTime    结算时间
     * @apiSuccess {String} body.department        科室
     * @apiSuccess {String} body.uniDepartment      对码后科室
     * @apiSuccess {BigDecimal} body.prepayments   预交金额
     * @apiSuccess {BigDecimal} body.personalPay     个人现金支付金额
     * @apiSuccess {BigDecimal} body.seriousIllnessFund           大病基金
     * @apiSuccess {BigDecimal} body.civilServantSubsidy          公务员补助
     * @apiSuccess {BigDecimal} body.birthFund                    生育基金
     * @apiSuccess {Object} additionInfo   报文附加信息
     * @apiSuccess {String} additionInfo.errorCode   错误代码 0:操作成功,1000001:操作失败
     * @apiSuccess {String} additionInfo.errorMsg   错误提示（不超过400字符）
     * @apiSuccess {String} additionInfo.receiverTradeNum   接收方交易流水号
     * @apiSuccess {String} additionInfo.correlationId   一串数字用于标识消息以防这条消息被修改
     * @apiSuccess {String} additionInfo.asyncAsk   用于标示是否采用异步请求机制
     * @apiSuccess {String} additionInfo.callback   异步请求后的回调地址，供平台调用返回结果报文
     * @apiSuccess {String} additionInfo.curDllAddr   异步请求后的回调地址，供动态库调用返回结果报文
     * @apiSuccessExample {json}       data 返回的数据内容
     * {
     * "package": {
     * "head": {
     * "busseID": "",
     * "sendTradeNum": "20150701083030100110010001",
     * "senderCode": "001",
     * "senderName": "消息发送者名称",
     * "receiverCode": "002",
     * "receiverName": "消息接受者的名称",
     * "hosorgNum": "001",
     * "hosorgName": "操作员姓名",
     * "systemType": "1",
     * "busenissType": "2",
     * "standardVersionCode": "version:1.1.0",
     * "clientmacAddress ": "30BB7E0A5E2D "
     * },
     * "body": [{
     * "accountPay": 0.0,
     * "admissionTime": 1531697767000,
     * "billType": 2,
     * "birthFund": 0.0,
     * "businessTransaction": "businessTransaction",
     * "civilServantSubsidy": 0.0,
     * "costCategory": "costCategory",
     * "uniCostCategory": "uniCostCategory",
     * "department": "外科",
     * "uniDepartment": "外科",
     * "dischargeTime": null,
     * "cusHosCode": 5560024,
     * "hospitalizationNo": "18070981",
     * "hospitalizationTimes": 1,
     * "insurePay": 0.0,
     * "insureSelfPay": null,
     * "invoiceNo": "",
     * "invoiceType": "住院发票",
     * "uniInvoiceType": "住院发票",
     * "otherPay": null,
     * "patientName": "赵某某",
     * "personalPay": 0.0,
     * "prepayments": null,
     * "receiptNo": "receiptNo",
     * "selfPay": 0.0,
     * "seriousIllnessFund": 0.0,
     * "settleTime": 1532052187000,
     * "totalPay": 0.0,
     * "visitNo": null
     * }],
     * "additionInfo": {
     * "errorCode": "0",
     * "errorMsg": "操作成功。",
     * "receiverTradeNum": "20150701083030100122310001",
     * "correlationId": "",
     * "asyncAsk": "0",
     * "callback": "",
     * "curDllAddr":""
     * }
     * }
     * }
     */
    public void version1() {

    }


    /**
     * @api {post} https://{ip}:{port}/oauth/token?grant_type=client_credentials   CT001 获取令牌
     * @apiVersion 1.1.0
     * @apiDescription <b>【使用说明】</b>第三方平台调用保险理赔平台的token获取,
     * 需使用分配给第三方平台用户名和密码通过username:password生成一个base64编码的参数放入headers中，
     * 设置为Authorization，第三方平台获取access_token时可以存储到本地，
     * 每次调用时放在headers的Authorization中，使用{token_type+空格+access_token}的格式即可，过期后需重新获取。
     * @apiName TOKEN
     * @apiGroup Data authentication
     *
     * @apiHeader {String} Content-Type 类型
     * @apiHeader {String} Authorization Basic base64(username:password)
     *
     * @apiHeaderExample {json} Header-Example:
     *     {
     *       "Content-Type": "application/json",
     *       "Authorization": "Basic WEFHOHUIFHWKEIHFKJWHEFKWJHE"
     *     }
     *
     * @apiSuccess {String} access_token   Token信息
     * @apiSuccess {String} token_type   Token类型
     * @apiSuccess {int} expires_in   过期时间(单位s)
     * @apiSuccess {String} scope   授权的作用域
     * @apiSuccess {String} jti   动态口令
     *
     *
     * @apiSuccessExample {json}       data 返回的数据内容
     *{
     *  "access_token": "MfEelCmD_YiQQspyv8AYUHVC3yrSkBTCGXYEeiv2YDk",
     *  "token_type": "bearer",
     *  "expires_in": 28799,
     *  "scope": "read",
     *  "jti": "04a0ae43-f6ca-4f0a-bfec-d1c055ee9488"
     *}
     */


    /**
     * @api {post} https://{ip}:{port}/push   QP023 数据推送(对码)
     * @apiVersion 1.1.0
     * @apiDescription <b>【使用说明】</b>获取平台推送返回病人门诊、住院、日清单、体检、检验、检查数据，客户需定义接收数据接口供平台调用，客户接收数据成功或者失败返回标记和错误信息，
     * 请求和返回需使用平台加密方式加密和解密。
     * @apiName push2
     * @apiGroup Data push
     * @apiParam {Json} package   请求报文
     * @apiParam {Object} head   报文头
     * @apiParam {String} [head.busseID]   业务编码
     * @apiParam {String} head.sendTradeNum   发送方交易流水号
     * @apiParam {String} head.senderCode   发起方编号
     * @apiParam {String} head.senderName   发起方名称
     * @apiParam {String} [head.receiverCode]  接收方编号
     * @apiParam {String} [head.receiverName]   接收方名称
     * @apiParam {String} [head.hosorgNum]   操作员编号
     * @apiParam {String} [head.hosorgName]   操作员名称
     * @apiParam {String} [head.systemType]   系统类型
     * @apiParam {String} head.busenissType   业务类型 1:车险人伤 2:极速赔
     * @apiParam {String} [head.clientmacAddress]  客户端mac地址
     * @apiParam {Object[]} body   返回参数
     * @apiParam {Byte} body.billType 单据类型 1-门诊已结算，2-住院已结算，3-住院每日清单，4-检验，5-检查，6-体检
     * @apiParam {Integer} body.hospitalId 医院编号
     * @apiParam {String} body.patientName 患者姓名
     * @apiParam {String} body.patientId  患者编码
     * @apiParam {String} body.identityNumber 证件号
     * @apiParam {String} body.age 年龄
     * @apiParam {Byte} body.gender 性别  0-未知，1-男，2-女
     * @apiParam {String} body.hospitalizationNo 住院号
     * @apiParam {String} body.businessTransaction 交易流水号
     * @apiParam {Integer} body.hospitalizationTimes 住院次数
     * @apiParam {String} body.receiptNo 单据号
     * @apiParam {String} body.invoiceNo 发票号
     * @apiParam {String} body.invoiceType 发票类型
     * @apiParam {String} body.uniInvoiceType 发票类型(对码后)
     * @apiParam {Date} body.admissionTime 入院时间/就诊日期
     * @apiParam {BigDecimal} body.insurePay 统筹金额
     * @apiParam {BigDecimal} body.accountPay 账户金额
     * @apiParam {BigDecimal} body.selfPay 自费金额
     * @apiParam {BigDecimal} body.insureSelfPay 自负金额
     * @apiParam {BigDecimal} body.classSelfPay 分类自负金额
     * @apiParam {BigDecimal} body.otherPay 其他金额
     * @apiParam {String} body.visitNo 门诊号
     * @apiParam {String} body.costCategory 费用类别
     * @apiParam {String} body.uniCostCategory 费用类别(对码后)
     * @apiParam {BigDecimal} body.totalPay 费用总额
     * @apiParam {Date} body.dischargeTime 出院时间
     * @apiParam {Date} body.settleTime 结算时间
     * @apiParam {String} body.department 科室
     * @apiParam {String} body.uniDepartment 科室(对码后)
     * @apiParam {BigDecimal} body.prepayments 预交金额
     * @apiParam {BigDecimal} body.personalPay 个人现金支付金额
     * @apiParam {BigDecimal} body.seriousIllnessFund 大病基金
     * @apiParam {BigDecimal} body.civilServantSubsidy 公务员补助
     * @apiParam {BigDecimal} body.birthFund 生育基金
     * @apiParam {Object[]} body.detailInfo 详情列表(单据类型为:1-门诊已结算，2-住院已结算，3-住院每日清单时存在数据)
     * @apiParam {String} body.detailInfo.itemNo 项目序号
     * @apiParam {String} body.detailInfo.oriItemName 项目名称
     * @apiParam {String} body.detailInfo.uniItemName 项目名称(对码后)
     * @apiParam {BigDecimal} body.detailInfo.itemAmount 数量
     * @apiParam {String} body.detailInfo.itemUnit 单位
     * @apiParam {BigDecimal} body.detailInfo.itemPrice 项目单价
     * @apiParam {BigDecimal} body.detailInfo.itemCost 项目总金额
     * @apiParam {String} body.detailInfo.itemSpec 项目规格
     * @apiParam {String} body.detailInfo.itemDosageForm 项目剂型
     * @apiParam {String} body.detailInfo.oriItemCode 项目编码
     * @apiParam {String} body.detailInfo.insureClass 医保类别
     * @apiParam {String} body.detailInfo.myselfScale 自负比例
     * @apiParam {String} body.detailInfo.oriItemClassName 项目类别名称
     * @apiParam {String} body.detailInfo.uniItemClassName 项目类别名称(对码后)
     * @apiParam {String} body.detailInfo.insureItemNo 医保项目编码
     * @apiParam {String} body.detailInfo.insureItemName 医保项目名称
     * @apiParam {Date} body.detailInfo.billingTime 结算时间
     * @apiParam {String} body.detailInfo.executeDepartment 执行科室
     * @apiParam {Object[]} body.diagnosisInfo 诊断列表(单据类型为:1-门诊已结算，2-住院已结算，3-住院每日清单时存在数据)
     * @apiParam {String} body.diagnosisInfo.diagnosisType 诊断类型
     * @apiParam {String} body.diagnosisInfo.uniDiagnosisType 诊断类型(对码后)
     * @apiParam {String} body.diagnosisInfo.diagnosisNo 诊断序号
     * @apiParam {String} body.diagnosisInfo.uniDiagnosisCode 诊断编码(对码后)
     * @apiParam {String} body.diagnosisInfo.diagnosisName 诊断名称
     * @apiParam {String} body.diagnosisInfo.uniDiagnosisName 诊断名称(对码后)
     * @apiParam {String} body.diagnosisInfo.insureDiagnosisCode 医保诊断编码
     * @apiParam {String} body.diagnosisInfo.uniInsureDiagnosisCode 医保诊断编码(对码后)
     * @apiParam {String} body.diagnosisInfo.insureDiagnosisName 医保诊断名称
     * @apiParam {String} body.diagnosisInfo.uniInsureDiagnosisName 医保诊断名称(对码后)
     * @apiParam {Short} body.diagnosisInfo.diagnosisLevel 诊断级别 0是主要诊断，1是次要诊断
     * @apiParam {String} body.diagnosisInfo.treatResult 治疗结果
     * @apiParam {Object[]} body.inspectInfo 检验信息(单据类型为:4-检验时存在数据)
     * @apiParam {String} body.inspectInfo.testNo 检验单号
     * @apiParam {String} body.inspectInfo.barcodeNo 条码号
     * @apiParam {String} body.inspectInfo.sampleNo 样本号
     * @apiParam {String} body.inspectInfo.checkName 检验名称
     * @apiParam {String} body.inspectInfo.sampleType 样本类型
     * @apiParam {String} body.inspectInfo.sampleInfo 样本情况
     * @apiParam {String} body.inspectInfo.tester 验者
     * @apiParam {Date} body.inspectInfo.acquisitionTime 采集时间
     * @apiParam {Date} body.inspectInfo.receiptTime 接受时间
     * @apiParam {Date} body.inspectInfo.auditTime 审核时间
     * @apiParam {Date} body.inspectInfo.reportTime 报告时间
     * @apiParam {Date} body.inspectInfo.labTime 检验时间
     * @apiParam {String} body.inspectInfo.checkDepartment 送检科室
     * @apiParam {String} body.inspectInfo.checkDoctor 送检医生
     * @apiParam {String} body.inspectInfo.reportSource 检验单来源，门诊/住院
     * @apiParam {String} body.inspectInfo.ward 病区
     * @apiParam {String} body.inspectInfo.clinicalDiagnosis 临床诊断
     * @apiParam {String} body.inspectInfo.note	备注
     * @apiParam {String} body.inspectInfo.resultStatus 报告状态
     * @apiParam {Object[]} body.inspectInfo.testItemInfo 检验项目明细
     * @apiParam {String} body.inspectInfo.testItemInfo.itemName 项目名称
     * @apiParam {String} body.inspectInfo.testItemInfo.abbreviation 缩写/英文
     * @apiParam {String} body.inspectInfo.testItemInfo.result 结果
     * @apiParam {String} body.inspectInfo.testItemInfo.abnormalMark 异常标识
     * @apiParam {String} body.inspectInfo.testItemInfo.units 单位
     * @apiParam {String} body.inspectInfo.testItemInfo.referenceRange 参考范围
     * @apiParam {Object[]} body.checkInfo 检查信息(单据类型为:5-检查时存在数据)
     * @apiParam {String} body.checkInfo.examNo 检查单编号
     * @apiParam {String} body.checkInfo.examClass 检查类别
     * @apiParam {String} body.checkInfo.examSubClass 检查子类
     * @apiParam {Date} body.checkInfo.examTime 检查时间
     * @apiParam {Date} body.checkInfo.auditTime 审核时间
     * @apiParam {Date} body.checkInfo.reportTime 报告时间
     * @apiParam {String} body.checkInfo.checkDepartment 送检科室
     * @apiParam {String} body.checkInfo.checkDoctor 送检医生
     * @apiParam {String} body.checkInfo.reporter 报告人
     * @apiParam {String} body.checkInfo.reportSource 检查单来源，门诊/住院
     * @apiParam {String} body.checkInfo.ward 病区
     * @apiParam {String} body.checkInfo.description 检查所见
     * @apiParam {String} body.checkInfo.impression 印象
     * @apiParam {String} body.checkInfo.recommendation 建议
     * @apiParam {String} body.checkInfo.pathologicDiagnosis 病理诊断
     * @apiParam {String} body.checkInfo.imageState 影像状态
     * @apiParam {Date} body.checkInfo.requestTime 申请时间
     * @apiParam {String} body.checkInfo.resultStatus 报告状态
     * @apiParam {Object[]} body.physicalInfo 体检信息(单据类型为:6-体检时存在数据)
     * @apiParam {String} body.physicalInfo.examReportNo 体检单号
     * @apiParam {String} body.physicalInfo.company 体检人单位
     * @apiParam {Date} body.physicalInfo.allExamDate 总检日期
     * @apiParam {String} body.physicalInfo.allExamDoctor 总检医师姓名
     * @apiParam {Object[]} body.physicalInfo.physicalExamConclusion 体检结论
     * @apiParam {String} body.physicalInfo.physicalExamConclusion.conclusionTitle 综述或建议标题
     * @apiParam {String} body.physicalInfo.physicalExamConclusion.conclusionDescription 综述或建议描述
     * @apiParam {String} body.physicalInfo.physicalExamConclusion.conclusionType 描述类型
     * @apiParam {Object[]} body.physicalInfo.physicalExamDept 体检科室信息
     * @apiParam {String} body.physicalInfo.physicalExamDept.examDeptCode 体检科室编号
     * @apiParam {String} body.physicalInfo.physicalExamDept.examDeptName 体检科室名称
     * @apiParam {String} body.physicalInfo.physicalExamDept.summary 科室小结
     * @apiParam {Object[]} body.physicalInfo.physicalExamDept.physicalExamItem 体检项目信息
     * @apiParam {String} body.physicalInfo.physicalExamDept.physicalExamItem.examItemTypeNo 体检项目类别编号
     * @apiParam {String} body.physicalInfo.physicalExamDept.physicalExamItem.examItemType 体检项目类别
     * @apiParam {String} body.physicalInfo.physicalExamDept.physicalExamItem.examItemNo 体检项目编号
     * @apiParam {String} body.physicalInfo.physicalExamDept.physicalExamItem.examItemName 体检项目
     * @apiParam {Date} body.physicalInfo.physicalExamDept.physicalExamItem.examDate 检验日期
     * @apiParam {String} body.physicalInfo.physicalExamDept.physicalExamItem.examDoctor 检验医生
     * @apiParam {String} body.physicalInfo.physicalExamDept.physicalExamItem.sampleType 标本类型
     * @apiParam {String} body.physicalInfo.physicalExamDept.physicalExamItem.examResult 检查结果
     * @apiParam {String} body.physicalInfo.physicalExamDept.physicalExamItem.resultFlag 结果标志
     * @apiParam {String} body.physicalInfo.physicalExamDept.physicalExamItem.referenceValue 参考值或参考范围
     * @apiParam {String} body.physicalInfo.physicalExamDept.physicalExamItem.itemUnit 单位
     * @apiParam {String} body.physicalInfo.physicalExamDept.physicalExamItem.examDesc 描述信息
     * @apiParam {String} body.physicalInfo.physicalExamDept.physicalExamItem.abbreviation 缩写/英文
     * @apiParam {Object} additionInfo   报文附加信息
     * @apiParam {String} additionInfo.errorCode   返回代码 1000000:操作成功,1000001:操作失败
     * @apiParam {String} additionInfo.errorMsg   错误提示
     * @apiParam {String} [additionInfo.receiverTradeNum]   接收方交易流水号
     * @apiParam {String} [additionInfo.correlationId]   一串数字用于标识消息以防这条消息被修改
     * @apiParam {String} [additionInfo.asyncAsk]   用于标示是否采用异步请求机制
     * @apiParam {String} [additionInfo.callback]   异步请求后的回调地址，供平台调用返回结果报文
     * @apiParam {String} [additionInfo.curDllAddr]   异步请求后的回调地址，供动态库调用返回结果报文
     * @apiParamExample {json}       请求数据格式
     * {
     * "package": {
     * "head": {
     * "busseID": "",
     * "sendTradeNum": "20150701083030100110010001",
     * "senderCode": "001",
     * "senderName": "消息发送者名称",
     * "receiverCode": "002",
     * "receiverName": "消息接受者的名称",
     * "hosorgNum": "001",
     * "hosorgName": "操作员姓名",
     * "systemType": "1",
     * "busenissType": "2",
     * "clientmacAddress ": "30BB7E0A5E2D "
     * },
     * "body": [{
     * "billType":null,
     * "hospitalId":"",
     * "patientName":"",
     * "patientId":"",
     * "identityNumber":"",
     * "age":"",
     * "gender":1,
     * "hospitalizationNo":"",
     * "businessTransaction":"",
     * "hospitalizationTimes":"",
     * "receiptNo":"",
     * "invoiceNo":"",
     * "invoiceType":"",
     * "uniInvoiceType":"",
     * "admissionTime":"",
     * "insurePay":"",
     * "accountPay":"",
     * "selfPay":"",
     * "insureSelfPay":"",
     * "classSelfPay":"",
     * "otherPay":"",
     * "visitNo":"",
     * "costCategory":"",
     * "uniCostCategory":"",
     * "totalPay":"",
     * "dischargeTime":"",
     * "settleTime":"",
     * "department":"",
     * "uniDepartment":"",
     * "prepayments":"",
     * "personalPay":"",
     * "seriousIllnessFund":"",
     * "civilServantSubsidy":"",
     * "birthFund":"",
     * "detailInfo":[{
     * "itemNo":"",
     * "uniItemName":"",
     * "oriItemName":"",
     * "itemAmount":"",
     * "itemUnit":"",
     * "itemPrice":"",
     * "itemCost":"",
     * "itemSpec":"",
     * "itemDosageForm":"",
     * "oriItemCode":"",
     * "insureClass":"",
     * "myselfScale":"",
     * "oriItemClassName":"",
     * "uniItemClassName":"",
     * "billingTime":"",
     * "insureItemNo":"",
     * "insureItemName":"",
     * "executeDepartment":""
     * }],
     * "diagnosisInfo":[{
     * "diagnosisType":"",
     * "uniDiagnosisType":"",
     * "diagnosisNo":"",
     * "uniDiagnosisCode":"",
     * "diagnosisName":"",
     * "uniDiagnosisName":"",
     * "insureDiagnosisCode":"",
     * "uniInsureDiagnosisCode":"",
     * "insureDiagnosisName":"",
     * "uniInsureDiagnosisName":"",
     * "diagnosisLevel":"",
     * "treatResult":""
     * }
     * ],
     * "physicalInfo":[{
     * "examReportNo":"",
     * "company":"",
     * "allExamDate":null,
     * "allExamDoctor":"",
     * "physicalExamConclusion":[{
     * "conclusionTitle":"",
     * "conclusionDescription":"",
     * "conclusionType":""
     * }],
     * "physicalExamDept":[{
     * "examDeptCode":"",
     * "examDeptName":"",
     * "summary":"",
     * "physicalExamItem":[{
     * "examItemTypeNo":"",
     * "examItemType":"",
     * "examItemNo":"",
     * "examItemName":"",
     * "examDate":null,
     * "examDoctor":"",
     * "sampleType":"",
     * "examResult":"",
     * "resultFlag":"",
     * "referenceValue":"",
     * "itemUnit":"",
     * "examDesc":"",
     * "abbreviation":""
     * }]
     * }]
     * }],
     * "inspectInfo":[{
     * "testNo":"",
     * "barcodeNo": "",
     * "sampleNo":"",
     * "checkName":"",
     * "sampleType":"",
     * "sampleInfo":"",
     * "tester":"",
     * "acquisitionTime":null,
     * "receiptTime":null,
     * "auditTime":null,
     * "reportTime":null,
     * "labTime":null,
     * "checkDepartment":"",
     * "checkDoctor":"",
     * "reportSource":"",
     * "ward":"",
     * "clinicalDiagnosis":"",
     * "note":"",
     * "resultStatus":"",
     * "testItemInfo":[{
     * "itemName":"",
     * "abbreviation":"",
     * "result":"",
     * "abnormalMark":"",
     * "units":"",
     * "referenceRange":""
     * }]
     * }],
     * "checkInfo":[{
     * "examNo":"",
     * "examClass":"",
     * "examSubClass":"",
     * "examTime":null,
     * "auditTime":null,
     * "reportTime":null,
     * "checkDepartment":"",
     * "checkDoctor":"",
     * "reporter":"",
     * "reportSource":"",
     * "ward":"",
     * "description":"",
     * "impression":"",
     * "recommendation":"",
     * "pathologicDiagnosis":"",
     * "imageState":"",
     * "requestTime":null,
     * "resultStatus":""
     * }]
     * }],
     * "additionInfo": {
     * "errorCode": "1000000",
     * "errorMsg": "",
     * "receiverTradeNum": "20150701083030100122310001",
     * "correlationId": "",
     * "asyncAsk": "0",
     * "callback": "",
     * "curDllAddr":""
     * }
     * }
     * }
     * @apiSuccess {Json} package   返回报文
     * @apiSuccess {Object} head   报文头
     * @apiSuccess {String} [head.busseID]   业务编码
     * @apiSuccess {String} head.sendTradeNum   发送方交易流水号（必填，交易流水号）
     * @apiSuccess {String} head.senderCode   发起方编号
     * @apiSuccess {String} head.senderName   发起方名称
     * @apiSuccess {String} [head.receiverCode]   接收方编号
     * @apiSuccess {String} [head.receiverName]   接收方名称
     * @apiSuccess {String} [head.hosorgNum]   操作员编号
     * @apiSuccess {String} [head.hosorgName]   操作员名称
     * @apiSuccess {String} [head.systemType]   系统类型
     * @apiSuccess {String} head.busenissType   业务类型 1:车险人伤 2:极速赔
     * @apiSuccess {String} [head.clientmacAddress]   客户端mac地址
     * @apiSuccess {Object[]} body   返回参数
     * @apiSuccess {Object} additionInfo   报文附加信息
     * @apiSuccess {String} additionInfo.errorCode   错误代码 1000000:操作成功
     * @apiSuccess {String} additionInfo.errorMsg   错误提示
     * @apiSuccess {String} [additionInfo.receiverTradeNum]   接收方交易流水号
     * @apiSuccess {String} [additionInfo.correlationId]   一串数字用于标识消息以防这条消息被修改
     * @apiSuccess {String} [additionInfo.asyncAsk]   用于标示是否采用异步请求机制
     * @apiSuccess {String} [additionInfo.callback]   异步请求后的回调地址，供平台调用返回结果报文
     * @apiSuccess {String} [additionInfo.curDllAddr]   异步请求后的回调地址，供动态库调用返回结果报文
     * @apiSuccessExample {json}       data 返回的数据内容
     * {
     * "package": {
     * "head": {
     * "busseID": "",
     * "sendTradeNum": "20150701083030100110010001",
     * "senderCode": "001",
     * "senderName": "消息发送者名称",
     * "receiverCode": "002",
     * "receiverName": "消息接受者的名称",
     * "intermediaryCode": "003",
     * "intermediaryName": "第三方的名称",
     * "hosorgNum": "001",
     * "hosorgName": "操作员姓名",
     * "systemType": "1",
     * "busenissType": "2",
     * "standardVersionCode": "version:1.1.0",
     * "clientmacAddress ": "30BB7E0A5E2D "
     * },
     * "body": [{
     * }],
     * "additionInfo": {
     * "errorCode": "1000000",
     * "errorMsg": "处理成功",
     * "receiverTradeNum": "20150701083030100122310001",
     * "correlationId": "",
     * "asyncAsk": "0",
     * "callback": "",
     * "curDllAddr":""
     * }
     * }
     * }
     */
    public void version5() {

    }
}
