// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, bennett.yang, creation
// ============================================================================

package com.bennett.ny.pizza.store;

import com.bennett.common.Pizza;
import com.bennett.common.PizzaIntegredientFactory;
import com.bennett.common.PizzaStore;
import com.bennett.pizza.entity.common.CheesePizza;
import com.bennett.pizza.entity.common.SlicePizza;
import com.bennett.pizza.entity.common.VeggiePizza;

/**
 * @author bennett.yang
 *
 */
public class NYStylePizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(final PizzaIntegredientFactory integredientFactory,final String type) {
        // TODO Auto-generated method stub
        if("cheese".equals(type)){
            pizza = new CheesePizza(integredientFactory);
        }else if("slice".equals(type)){
            pizza = new SlicePizza(integredientFactory);
        }else if("veggie".equals(type)){
            pizza = new VeggiePizza(integredientFactory);
        }
        return pizza;
    }

}
