package com.qf.test;



import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qf.service.AccoutService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TXTest {
	@Resource(name="accountService")
	private AccoutService its;

	@Test
	public void fun1() {
		its.transfer(1, 2, 100d);
	}
}
