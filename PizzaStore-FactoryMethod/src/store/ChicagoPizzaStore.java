package store;

import pizza.Pizza;
import pizza.PizzaType;
import pizza.chicago.ChicagoStyleCheesePizza;
import pizza.chicago.ChicagoStyleClamPizza;
import pizza.chicago.ChicagoStylePepperoniPizza;
import pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(PizzaType type) {
		switch (type) {
		case CHEESE:
			return new ChicagoStyleCheesePizza();
		case PEPPERONI:
			return new ChicagoStylePepperoniPizza();
		case VEGGIE:
			return new ChicagoStyleVeggiePizza();
		case CLAM:
			return new ChicagoStyleClamPizza();
		default:
			throw new IllegalArgumentException("Invalid PizzaType: " + type);
		}
	}
}
