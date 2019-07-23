// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, bennett.yang, creation
// ============================================================================

package com.bennett.pizza.entity.common;

import java.util.List;

import com.bennett.common.Pizza;
import com.bennett.common.PizzaIntegredientFactory;
import com.bennett.materials.common.Cheese;
import com.bennett.materials.common.Clam;
import com.bennett.materials.common.Dough;
import com.bennett.materials.common.Sauce;

/**
 * @author bennett.yang
 *
 */
public class SlicePizza extends Pizza {
    PizzaIntegredientFactory integredientFactory;
    Cheese cheese;
    Clam clam;
    Dough dough;
    Sauce sauce;
    String pepperoni;
    List<String> veggie;


    public SlicePizza(final PizzaIntegredientFactory integredientFactory){
        this.integredientFactory = integredientFactory;
    }

    @Override
    public void prepare(){
        clam = integredientFactory.createClam();
        System.out.println("adding clam: "+clam.getName());
        sauce = integredientFactory.createSauce();
        System.out.println("adding sauce: "+sauce.getName());
        pepperoni = integredientFactory.createPepperoni();
        System.out.println("adding pepperoni: "+pepperoni);
        veggie = integredientFactory.createVeggies();
        System.out.println("adding veggie"+ veggie);
        System.out.println("Slice Pizza created");
    }
}
