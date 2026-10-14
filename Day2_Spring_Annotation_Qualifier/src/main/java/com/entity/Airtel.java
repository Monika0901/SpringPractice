package com.entity;

import org.springframework.stereotype.Component;

@Component("air")
public class Airtel  implements sim{

	@Override
	public String calling() {
		return "calling from airtel";
		
	}

}
