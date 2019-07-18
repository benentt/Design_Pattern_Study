package com.bennett.common;

public abstract class Beverage {
	protected Beverage beverage;
	
	protected String description = "Unknow beverage";
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
