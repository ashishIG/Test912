package com.infogain.aspects;

import java.io.File;
import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingClass {
 
	@Before("execution(public void*(..)")
	public void ProductDetails()
	{
		Date d=new Date();
		System.out.println("today date is "+d);
	}
	
	
	
}
