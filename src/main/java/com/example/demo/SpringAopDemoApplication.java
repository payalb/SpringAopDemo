package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.example.demo.business.Calculator;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopDemoApplication {


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAopDemoApplication.class, args);
		Calculator calc = context.getBean(Calculator.class);
		calc.add(3, 4);
		calc.div(4, 0);
	}

}
