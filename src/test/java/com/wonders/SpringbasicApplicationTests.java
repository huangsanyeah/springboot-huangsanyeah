package com.wonders;

import com.wonders.uniqueid.UidService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbasicApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private UidService uidService;
	@Test
	public void uidTest() throws Exception {
		Long a=uidService.fetchUUID("123",7L);
		System.out.println("全局唯一id"+a);
	}

}
