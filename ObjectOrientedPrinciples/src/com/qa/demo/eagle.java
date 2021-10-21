package com.qa.demo;

import com.qa.bird.BirdAbstract;

public class eagle extends BirdAbstract {
	
	private String predator;
	private int wingSpan;
	private String name;
	
	public eagle(String predator, int wingSpan, String name) {
		super();
		this.predator = predator;
		this.wingSpan = wingSpan;
		this.name = name;
	}

	@Override
	public String toString() {
		return "eagle [predator=" + predator + ", wingSpan=" + wingSpan + ", name=" + name + "]";
	}

	@Override
	public boolean canFly() {
		return true;
		
	}

}
