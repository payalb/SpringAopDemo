package com.example.demo.service;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
//Aspect jar
@Service
@Aspect
@Order(1)
public class LoggingService  {
	
	Logger logger= Logger.getLogger(LoggingService.class.getName());
	//pointcut expression: condition telling for wha class/methods this servcie should be executed
	@Around(value="initExp()",argNames="jp")
	public Object invoke(ProceedingJoinPoint jp) throws Throwable {
		logger.info("Entering method "+jp.getSignature());
		Object o=jp.proceed();//business logic
		logger.info("Exiting method "+ jp.getSignature());
		return o;
	}
	
	
	
	@Pointcut(value = "execution(public * com.example..*.*(..))")
	public void initExp() {

	}

}
