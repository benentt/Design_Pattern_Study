package com.bennett.util;

import com.bennett.common.Pizza;
import com.bennett.pizza.entity.ChessPizza;
import com.bennett.pizza.entity.GreekPizza;
import com.bennett.pizza.entity.PepperoniPizza;

public class SimplePizzaFactory {
	public static Pizza createPizza(String pizzaName) {
		Pizza pizza =null;
		if("Chess".equals(pizzaName)) {
			pizza = new ChessPizza();
		}else if("Greek".equals(pizzaName)) {
			pizza = new GreekPizza();
		}else if("PepperoniPizza".equals(pizzaName)) {
			pizza = new PepperoniPizza();
		}
		return pizza;
	}
}
