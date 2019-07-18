package com.bennett.beverage.entity;

import java.util.HashMap;
import java.util.Map;


import com.bennett.common.Beverage;

public class Espresso extends Beverage{

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

	public Espresso() {
		description = "Espresso coffe";
	}
	
	public  Espresso(int size) {
		// TODO Auto-generated constructor stub
		this();
		this.size = size;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 15+sizeValue.get(getSize());
	}
	
	private int getSize() {
		return size;
	};

}
