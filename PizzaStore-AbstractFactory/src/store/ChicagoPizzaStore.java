package store;

import ingredient.factory.ChicagoPizzaIngredientFactory;
import ingredient.factory.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import pizza.PizzaType;
import pizza.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(PizzaType type) {
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		Pizza pizza = null;
		switch (type) {
		case CHEESE:
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
			break;
		case CLAM:
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
			break;
		case PEPPERONI:
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
			break;
		case VEGGIE:
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
			break;
		default:
			throw new IllegalArgumentException("Invalid PizzaType: " + type);
		}

		return pizza;
	}

}
