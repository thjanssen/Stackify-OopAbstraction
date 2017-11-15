package org.thoughts.on.java.coffee;

public class BrewingUnit {

	public Coffee brew(CoffeeSelection selection, GroundCoffee groundCoffee,
			double quantity) {
		return new Coffee(selection, quantity);
	}

}
