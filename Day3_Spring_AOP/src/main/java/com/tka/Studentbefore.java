package com.tka;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Studentbefore {
	
	@Before("execution(* com.tka.StudentMainLogic.*(..))")
	public void runbefore() {
		System.out.println("check your login detail");
	}

}
