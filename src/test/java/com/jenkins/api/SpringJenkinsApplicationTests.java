package com.jenkins.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	
	 public static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	@Test
	public  contextL() {
		logger.info("Test case executing");
		logger.info("Test case executing second log ");
		Assertions.assertEquals(true, true);
	

	}

	

}
