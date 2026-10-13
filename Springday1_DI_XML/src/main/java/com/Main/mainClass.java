package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Country;
import com.entity.employee;

public class mainClass {
	
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
	employee emp = context.getBean("emp",employee.class);
	Country con = context.getBean("con", Country.class);
	
	System.out.println(con);
	System.out.println(emp);
	
	}
}
