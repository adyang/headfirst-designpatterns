package store;

import pizza.Pizza;
import pizza.PizzaType;

public abstract class PizzaStore {
	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	abstract Pizza createPizza(PizzaType type);
}
