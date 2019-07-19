package com.bennett.common;

import com.bennett.util.SimplePizzaFactory;

public class PizzaStore {
	//由于是pizzaStore，商店里面应该包涵所有pizza可以预购才对，因此不适用于直接在外创建
	private static Pizza pizza;
	
	public static Pizza createPizza(String pizzaName) {
		return SimplePizzaFactory.createPizza(pizzaName);		//若是pizza在此实例化，则每次pizza种类有更新则得不断更改此基类，违反了对修改关闭原则。
	}
	
	public static void orderPizza(String pizzaNmae) {
		pizza = createPizza(pizzaNmae);	//若是pizza在此创建则太过难以维护，并且返回对象被固定死
		if(pizza!=null) {
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
			System.out.println("Pizza ordered");
		}else {
			System.out.println("no this pizza");
		}
	}
	
}
