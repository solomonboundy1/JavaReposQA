package com.qa.demo;

import java.util.List;

import com.qa.interfaces.Developer;

public class Project  {
	
//	private Developer dev;
//	
//	public Project(Developer dev) {
//		this.dev = dev;
//	}
//	
//	public void implement() {
//		this.dev.develop();
//	}
	
	private static List<Developer> developers;
	public Project(List<Developer> developers) {
		this.developers = developers;
	}
	
	public static void implement() {
		developers.forEach(dev -> dev.develop());
	}

}
