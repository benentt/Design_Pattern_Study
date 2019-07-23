// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, bennett.yang, creation
// ============================================================================

package com.bennett.chicago.pizza.store;

import com.bennett.chicago.pizza.entity.ChicagoStyleCheesePizza;
import com.bennett.chicago.pizza.entity.ChicagoStyleSlicePizza;
import com.bennett.chicago.pizza.entity.ChicagoStyleVeggiePizza;
import com.bennett.common.Pizza;
import com.bennett.common.PizzaStore;

/**
 * @author bennett.yang
 *
 */
public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(final String type) {
        // TODO Auto-generated method stub
        if("cheese".equals(type)){
            pizza = new ChicagoStyleCheesePizza();
        }else if("slice".equals(type)){
            pizza = new ChicagoStyleSlicePizza();
        }else if("veggie".equals(type)){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }

}
