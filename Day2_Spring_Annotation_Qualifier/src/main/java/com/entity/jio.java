package com.entity;

import org.springframework.stereotype.Component;

@Component("jio")
public class jio implements sim{

	@Override
	public String calling() {
     return "calling from jio";
		
	}

}
