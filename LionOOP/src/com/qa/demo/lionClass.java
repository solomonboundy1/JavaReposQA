package com.qa.demo;

import com.qa.feline.Feline;

public class lionClass extends Feline {
	
	private String name;
	private String maleOrFemale;
	private boolean cub;
	private int height;
	
	
	
	public lionClass(String name, String maleOrFemale, boolean cub, int height) {
		super();
		this.name = name;
		this.maleOrFemale = maleOrFemale;
		this.cub = cub;
		this.height = height;
	
	}


	@Override
	public String toString() {
		return "lionClass [name=" + name + ", maleOrFemale=" + maleOrFemale + ", cub=" + cub + ", height=" + height
				+ "]";
	}
	
	@Override
	public boolean hasStripes() {
		
		return false;
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


	public boolean isCub(boolean cub) {
		if(height < 80)
		{
			this.cub = true;
		}
		return cub;
	}





	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	
	
	
}
