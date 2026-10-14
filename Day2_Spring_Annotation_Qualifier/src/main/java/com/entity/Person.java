package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired
	
	sim sim1;
	
	@Autowired
	
	sim sim2;

	public sim getSim1() {
		return sim1;
	}

	public void setSim1(sim sim1) {
		this.sim1 = sim1;
	}

	public sim getSim2() {
		return sim2;
	}

	public void setSim2(sim sim2) {
		this.sim2 = sim2;
	}
	
	
}
