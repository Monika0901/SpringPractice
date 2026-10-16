package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cfg.myConfigClass;

public class mainClass {
	
	public static void main(String args[]) {
        ApplicationContext context= new AnnotationConfigApplicationContext(myConfigClass.class);
        StudentMainLogic std = context.getBean(StudentMainLogic.class);
        std.login();
	}

}
