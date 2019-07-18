package com.bennett.subject.entity;

import java.util.ArrayList;
import java.util.List;

import com.bennett.common.Observer;
import com.bennett.common.Subject;

public class WeatherData extends Subject{
	List<Observer> observers;
	float temp;
	float humidity;
	float pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notificationAllObservers() {
		// TODO Auto-generated method stub
		for(Observer o :observers) {
			o.update(temp,humidity,pressure);
		}
	}

	public void measurementsChanged() {
		notificationAllObservers();
	}
	
	public void setMeasurement(float temp,float humidity,float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
