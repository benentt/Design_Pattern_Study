package com.bennett.common;

public abstract class Duck {
	public FlyBehaviour fb;
	public QuackBehaviour qb;
	public abstract void show();
	public void fly() {
		fb.fly();
	}
	public void quack() {
		qb.quack();
	}
	
}
