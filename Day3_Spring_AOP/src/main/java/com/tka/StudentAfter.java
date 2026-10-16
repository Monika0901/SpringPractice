package com.tka;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentAfter {
	@After("execution(* com.tka.StudentMainLogic.*(..))")
	 public void runafter() {
		 System.out.println("login successfully");
	 }

}
