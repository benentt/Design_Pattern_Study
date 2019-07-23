// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, bennett.yang, creation
// ============================================================================

package com.bennett.common;

/**
 * @author bennett.yang
 *
 */
public abstract class PizzaStore {
    public Pizza pizza = null;
    public abstract Pizza createPizza(String type);

    public void orederPizza(final String type){
        pizza = createPizza(type);
        if (pizza!=null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }else{
            System.out.println("no exist pizza type : "+type);
        }
    }
}
