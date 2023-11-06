package com.JEN2.JEN2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class Jen2Application {
	public static Logger logger=LoggerFactory.getLogger(Jen2Application.class);
	
	@javax.annotation.PostConstruct
	public void init()
	{
		logger.info("APPLICATION STARTED ");;
	}
	
	public static void main(String[] args) {
		logger.info("Application Executed");;
		SpringApplication.run(Jen2Application.class, args);
		System.out.println("MAIN FUNCITON STARTED");
	}

}
