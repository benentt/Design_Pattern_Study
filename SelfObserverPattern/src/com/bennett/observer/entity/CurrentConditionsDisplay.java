package com.bennett.observer.entity;

import com.bennett.common.DisplayElement;
import com.bennett.common.Observer;
import com.bennett.common.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	Subject subject;
	float temp;
	float humidity;
	float pressure;
	
	public CurrentConditionsDisplay(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions:"+temp+" F degress and "+humidity+"% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
	}

}
