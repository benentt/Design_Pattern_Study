package com.bennett.duck.entity;

import com.bennett.common.Duck;
import com.bennett.common.FlyBehaviour;
import com.bennett.common.QuackBehaviour;

public class DecoyDuck extends Duck{

	public DecoyDuck(FlyBehaviour fb,QuackBehaviour qb) {
		this.fb = fb;
		this.qb = qb;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am a decoy duck");
	}
	
}
