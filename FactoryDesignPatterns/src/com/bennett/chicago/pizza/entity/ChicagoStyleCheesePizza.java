// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, bennett.yang, creation
// ============================================================================

package com.bennett.chicago.pizza.entity;

import com.bennett.common.Pizza;

/**
 * @author bennett.yang
 *
 */
public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Cheese Pizza";
        dough = "Thin Curst Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Raggino Cheese Cheese");
    }
}
