package com.example.demo;

import com.example.demo.aoua.Example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


	@Test
	public void contextLoads() {
	}

	@Test
	public void testerList() {
		Assert.assertEquals(1,Example.getList().size());
	}

}
