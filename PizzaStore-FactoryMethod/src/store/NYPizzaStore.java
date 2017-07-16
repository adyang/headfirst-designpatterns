package store;

import pizza.Pizza;
import pizza.PizzaType;
import pizza.newyork.NYStyleCheesePizza;
import pizza.newyork.NYStyleClamPizza;
import pizza.newyork.NYStylePepperoniPizza;
import pizza.newyork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(PizzaType type) {
		switch (type) {
		case CHEESE:
			return new NYStyleCheesePizza();
		case PEPPERONI:
			return new NYStylePepperoniPizza();
		case VEGGIE:
			return new NYStyleVeggiePizza();
		case CLAM:
			return new NYStyleClamPizza();
		default:
			throw new IllegalArgumentException("Invalid PizzaType: " + type);
		}
	}
}
