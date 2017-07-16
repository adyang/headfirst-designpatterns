package store;

import ingredient.factory.NYPizzaIngredientFactory;
import ingredient.factory.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.ClamPizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import pizza.PizzaType;
import pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(PizzaType type) {
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

		Pizza pizza = null;
		switch (type) {
		case CHEESE:
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
			break;
		case CLAM:
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
			break;
		case PEPPERONI:
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
			break;
		case VEGGIE:
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
			break;
		default:
			throw new IllegalArgumentException("Invalid PizzaType: " + type);
		}

		return pizza;
	}

}
