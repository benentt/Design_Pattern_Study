package com.bennett.decorator.entity;

import com.bennett.common.Beverage;
import com.bennett.common.ConditionDecorator;

public class Soy extends ConditionDecorator{

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription()+",Soy";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.4;
	}

}
