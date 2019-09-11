package com.example.demo.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
@Service
@Aspect
@Order(2)
public class ExceptionHandlerService {
	
	@AfterThrowing(pointcut="LoggingService.initExp()",throwing="ex")
	public void afterThrowing( JoinPoint p,Exception ex) {
		System.out.println("Error executing method"+ p.getSignature()+ ", reason  is"+ ex.getMessage());
	}
	
}
