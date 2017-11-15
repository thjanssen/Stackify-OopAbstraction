package org.thoughts.on.java.coffee;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TestCoffeeMachine {

	@Test
	public void testEspresso() throws CoffeeException {
		// create a Map of available coffee beans
		Map<CoffeeSelection, CoffeeBean> beans = new HashMap<CoffeeSelection, CoffeeBean>();
		beans.put(CoffeeSelection.ESPRESSO, new CoffeeBean("My favorite espresso bean", 1000));
		beans.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean("My favorite filter coffee bean", 1000));
		
		// get a new CoffeeMachine object
		CoffeeMachine machine = new CoffeeMachine(beans);
		// brew a fresh coffee
		Coffee espresso = machine.brewCoffee(CoffeeSelection.ESPRESSO);
		
		Assert.assertEquals(CoffeeSelection.ESPRESSO, espresso.getSelection());
		Assert.assertEquals(28d, espresso.getQuantity(), 0.01);
	}
}
