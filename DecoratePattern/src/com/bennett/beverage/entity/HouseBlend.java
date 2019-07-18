package com.bennett.beverage.entity;

import java.util.HashMap;
import java.util.Map;


import com.bennett.common.Beverage;

public class HouseBlend extends Beverage{

	public static final int S = 0;
	public static final int M = 1;
	public static final int L = 2;
	private static  Map<Integer, Double> sizeValue; 
	static {
		sizeValue = new HashMap<>();
		sizeValue.put(0, 0.1);
		sizeValue.put(1, 0.15);
		sizeValue.put(2, 0.20);
	}
	private int size;

	public HouseBlend() {
		description = "HouseBlend coffe";
	}
	
	public  HouseBlend(int size) {
		// TODO Auto-generated constructor stub
		this();
		this.size = size;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 9+sizeValue.get(getSize());
	}
	
	private int getSize() {
		return size;
	};

}
