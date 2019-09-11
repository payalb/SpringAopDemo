package com.example.demo.business;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	//business logic
	public int add(int a, int b) {
		System.out.println(a+b);
		return a+b;
	}
	public int div(int a, int b) {
		return a/b;
	}
}
