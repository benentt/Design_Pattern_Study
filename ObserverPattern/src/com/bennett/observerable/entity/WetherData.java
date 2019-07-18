package com.bennett.observerable.entity;

import java.util.Observable;

public class WetherData extends Observable{
	private float temp;
	private float humidity;
	private float pressure;
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurement(float temp,float humidity,float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public float getTemp() {
		return temp;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
}
