// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, bennett.yang, creation
// ============================================================================

package main;

import com.bennett.chicago.pizza.store.ChicagoStylePizzaStore;
import com.bennett.common.PizzaStore;

/**
 * @author bennett.yang
 *
 */
public class PizzaTest {
    public static void main(final String[] args) {
        final PizzaStore pizzaStore = new ChicagoStylePizzaStore();
        pizzaStore.orederPizza("cheese");
        //for fault spell,create a constant to save these type

        //class for Name    -> pack.class name
        //location-> Chicago        Type->Veggie
        //class name contact location+Style+Type+Pizza
        //package contact com.bennett.locaition.pizza.entity
    }
}
