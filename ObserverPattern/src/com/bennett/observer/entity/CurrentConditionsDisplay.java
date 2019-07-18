package com.bennett.observer.entity;

import java.util.Observable;
import java.util.Observer;

import com.bennett.common.DisplayElement;
import com.bennett.observerable.entity.WetherData;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	Observable observable;
	float temp;
	float humidity;
	
	public CurrentConditionsDisplay(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions:"+temp+" F degress and "+humidity+"% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof WetherData) {
			WetherData wetherData = (WetherData)o;
			temp = wetherData.getTemp();
			humidity = wetherData.getHumidity();
		}
	}

}
