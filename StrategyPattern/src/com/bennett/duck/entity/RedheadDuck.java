package com.bennett.duck.entity;

import com.bennett.common.Duck;
import com.bennett.common.FlyBehaviour;
import com.bennett.common.QuackBehaviour;

public class RedheadDuck extends Duck{

	public RedheadDuck(FlyBehaviour fb,QuackBehaviour qb) {
		this.fb = fb;
		this.qb = qb;
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am a red head duck");
	}

}
