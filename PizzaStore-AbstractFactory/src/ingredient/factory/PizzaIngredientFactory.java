package ingredient.factory;

import java.util.List;

import ingredient.Cheese;
import ingredient.Clams;
import ingredient.Dough;
import ingredient.Pepperoni;
import ingredient.Sauce;
import ingredient.Veggie;

public interface PizzaIngredientFactory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public List<Veggie> createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClams();
}
