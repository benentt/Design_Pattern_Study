// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, bennett.yang, creation
// ============================================================================

package com.bennett.common;

import com.bennett.pizza.entity.common.CheesePizza;
import com.bennett.pizza.entity.common.SlicePizza;
import com.bennett.pizza.entity.common.VeggiePizza;

/**
 * @author bennett.yang
 *
 */
public class PizzaStore {
    public Pizza pizza = null;
    public Pizza createPizza(final PizzaIntegredientFactory integredientFactory,final String type){
        if("cheese".equals(type)){
            pizza = new CheesePizza(integredientFactory);
        }else if("slice".equals(type)){
            pizza = new SlicePizza(integredientFactory);
        }else if("veggie".equals(type)){
            pizza = new VeggiePizza(integredientFactory);
        }
        return pizza;
    };

    public void orderPizza(final PizzaIntegredientFactory integredientFactory,final String type){
        pizza = createPizza(integredientFactory,type);
        if (pizza!=null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }else{
            System.out.println("no exist pizza type : "+integredientFactory);
        }
    }
}
