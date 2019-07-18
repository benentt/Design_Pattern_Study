package com.bennett.common;

public abstract class Subject {
	public abstract void registerObserver(Observer o);
	public abstract void unregisterObserver(Observer o);
	public abstract void notificationAllObservers();
}
