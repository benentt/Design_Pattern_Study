package com.bennett.decorator.entity;

import com.bennett.common.Beverage;
import com.bennett.common.ConditionDecorator;

public class Mocha extends ConditionDecorator{

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription()+",Mocha";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.2;
	}

}
