package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.entity.Employee;

@ComponentScan
public class myConfigClass {
	
@Bean("emp")
public Employee objEmp() {
	return new Employee();
	
}


}
