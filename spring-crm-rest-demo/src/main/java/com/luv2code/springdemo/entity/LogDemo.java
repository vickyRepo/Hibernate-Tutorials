package com.luv2code.springdemo.entity;

import org.apache.log4j.Logger;


public class LogDemo {
	
	static Logger l=Logger.getLogger(LogDemo.class.getName());

	public static void main(String[] args) {
		 
		 l.debug("This is debug message");
	      l.info("This is info message");
	      l.warn("This is warn message");
	      l.fatal("This is fatal message");
	      l.error("This is error message");

	      System.out.println("Your logic executed successfully....");

		
	}

}
