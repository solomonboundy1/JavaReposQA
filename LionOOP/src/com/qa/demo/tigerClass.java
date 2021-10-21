package com.qa.demo;

import com.qa.feline.Feline;

public class tigerClass extends Feline {
	
	private String name;
	private String maleOrFemale;
	private boolean cub;
	private int height;
	
	public tigerClass(String name, String maleOrFemale, boolean cub, int height) {
		super();
		this.name = name;
		this.maleOrFemale = maleOrFemale;
		this.cub = cub;
		this.height = height;
		
	}

	@Override
	public String toString() {
		return "tigerClass [name=" + name + ", maleOrFemale=" + maleOrFemale + ", cub=" + cub + ", height=" + height
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaleOrFemale() {
		return maleOrFemale;
	}

	public void setMaleOrFemale(String maleOrFemale) {
		this.maleOrFemale = maleOrFemale;
	}

	public boolean isCub() {
		return cub;
	}

	public void setCub(boolean cub) {
		this.cub = cub;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
