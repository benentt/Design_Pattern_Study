// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, bennett.yang, creation
// ============================================================================

package com.bennett.common;

import java.util.ArrayList;

import com.bennett.materials.common.Cheese;
import com.bennett.materials.common.Clam;
import com.bennett.materials.common.Dough;
import com.bennett.materials.common.Sauce;

/**
 * @author bennett.yang
 *
 */
public interface PizzaIntegredientFactory {
    public abstract Dough createDough();
    public abstract Sauce createSauce();
    public abstract Cheese createCheese();
    public abstract ArrayList<String> createVeggies();
    public abstract String createPepperoni();
    public abstract Clam createClam();
}
