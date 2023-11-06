package com.JEN2.JEN2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class Jen2ApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(Jen2ApplicationTests.class);
	@Test
	void contextLoads() {
		
		logger.info("TETING STARTED ");
		assertEquals(true, true);
	}

}
