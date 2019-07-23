// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, bennett.yang, creation
// ============================================================================

package com.bennett.ny.pizza.entity;

import com.bennett.common.Pizza;

/**
 * @author bennett.yang
 *
 */
public class NYStyleSlicePizza extends Pizza{
    public NYStyleSlicePizza(){
        name = "NY style Deep Dish Slice Pizza";
        dough = "Extra Thick Curst Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarealla Cheese");
    }

    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
