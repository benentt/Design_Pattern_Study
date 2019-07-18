package com.bennett.common;

public abstract class ConditionDecorator extends Beverage{
	protected Beverage beverage;
	
	
	@Override
	public abstract double cost();

}
