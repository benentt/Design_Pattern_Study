// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, bennett.yang, creation
// ============================================================================

package com.bennett.ny.pizza.store;

import com.bennett.common.Pizza;
import com.bennett.common.PizzaStore;
import com.bennett.ny.pizza.entity.NYStyleCheesePizza;
import com.bennett.ny.pizza.entity.NYStyleSlicePizza;
import com.bennett.ny.pizza.entity.NYStyleVeggiePizza;

/**
 * @author bennett.yang
 *
 */
public class NYStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(final String type) {
        // TODO Auto-generated method stub
        if("cheese".equals(type)){
            pizza = new NYStyleCheesePizza();
        }else if("slice".equals(type)){
            pizza = new NYStyleSlicePizza();
        }else if("veggie".equals(type)){
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }

}
