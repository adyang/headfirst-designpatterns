package factory;

import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import pizza.PizzaType;
import pizza.VeggiePizza;

public class SimplePizzaFactory {
	public Pizza createPizza(PizzaType type) {
		switch (type) {
		case CHEESE:
			return new CheesePizza();
		case PEPPERONI:
			return new PepperoniPizza();
		case VEGGIE:
			return new VeggiePizza();
		case CLAM:
			return new ClamPizza();
		default:
			throw new IllegalArgumentException("Invalid PizzaType: " + type);
		}
	}
}
