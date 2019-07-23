package com.bennett.ny.pizza.integredient;

// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, bennett.yang, creation
// ============================================================================


import java.util.ArrayList;

import com.bennett.common.PizzaIntegredientFactory;
import com.bennett.materials.cheese.entity.ReggianoCheese;
import com.bennett.materials.clam.entity.FrozenClams;
import com.bennett.materials.common.Cheese;
import com.bennett.materials.common.Clam;
import com.bennett.materials.common.Dough;
import com.bennett.materials.common.Sauce;
import com.bennett.materials.dough.entity.ThinCrustDough;
import com.bennett.materials.sauce.entity.PlumTomatoSauce;

/**
 * @author bennett.yang
 *
 */
public class NYPizzaIntegredientFactory implements PizzaIntegredientFactory{

    @Override
    public Dough createDough() {
        // TODO Auto-generated method stub
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        // TODO Auto-generated method stub
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        // TODO Auto-generated method stub
        return new ReggianoCheese();
    }

    @Override
    public ArrayList<String> createVeggies() {
        // TODO Auto-generated method stub
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("lettuce");
        arrayList.add("testVeggtable");
        arrayList.add("Kale");
        return arrayList;
    }

    @Override
    public String createPepperoni() {
        // TODO Auto-generated method stub
        return "Pepperoni";
    }

    @Override
    public Clam createClam() {
        // TODO Auto-generated method stub
        return new FrozenClams();
    }

}
