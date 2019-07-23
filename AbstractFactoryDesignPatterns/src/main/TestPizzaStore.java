// Copyright (c) 1998-2019 Core Solutions Limited. All rights reserved.
// ============================================================================
// CURRENT VERSION CNT.5.0.1
// ============================================================================
// CHANGE LOG
// CNT.5.0.1 : 2019-XX-XX, bennett.yang, creation
// ============================================================================

package main;

import com.bennett.chicago.pizza.integredient.ChicagoPizzaIntegredientFactory;
import com.bennett.common.PizzaStore;
import com.bennett.ny.pizza.integredient.NYPizzaIntegredientFactory;

/**
 * @author bennett.yang
 *
 */
public class TestPizzaStore {
    public static void main(final String[] args) {
        final PizzaStore pizzaStore = new PizzaStore();
        final ChicagoPizzaIntegredientFactory chicagoPizzaIntegredientFactory = new ChicagoPizzaIntegredientFactory();
        final NYPizzaIntegredientFactory nyPizzaIntegredientFactory = new NYPizzaIntegredientFactory();
        pizzaStore.orderPizza(chicagoPizzaIntegredientFactory, "cheese");

        System.out.println("---------");
        pizzaStore.orderPizza(chicagoPizzaIntegredientFactory, "slice");

        System.out.println("---------");
        pizzaStore.orderPizza(chicagoPizzaIntegredientFactory, "veggie");

        System.out.println("---------");
        pizzaStore.orderPizza(nyPizzaIntegredientFactory, "cheese");

        System.out.println("---------");
        pizzaStore.orderPizza(nyPizzaIntegredientFactory, "slice");

        System.out.println("---------");
        pizzaStore.orderPizza(nyPizzaIntegredientFactory, "veggie");
    }
}
