package store;

import pizza.Pizza;
import pizza.PizzaType;

public abstract class PizzaStore {
	abstract Pizza createPizza(PizzaType type);

	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = createPizza(type);

		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
