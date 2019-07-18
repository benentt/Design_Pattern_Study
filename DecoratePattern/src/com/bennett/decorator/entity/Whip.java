package com.bennett.decorator.entity;

import com.bennett.common.Beverage;
import com.bennett.common.ConditionDecorator;

public class Whip extends ConditionDecorator{

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription()+",Whip";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+0.3;
	}

}
