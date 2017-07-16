package ingredient.factory;

import java.util.Arrays;
import java.util.List;

import ingredient.Cheese;
import ingredient.Clams;
import ingredient.Dough;
import ingredient.FreshClams;
import ingredient.Garlic;
import ingredient.MarinaraSauce;
import ingredient.Mushroom;
import ingredient.Onion;
import ingredient.Pepperoni;
import ingredient.RedPepper;
import ingredient.ReggianoCheese;
import ingredient.Sauce;
import ingredient.SlicedPepperoni;
import ingredient.ThinCrustDough;
import ingredient.Veggie;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public List<Veggie> createVeggies() {
		return Arrays.asList(new Garlic(), new Onion(), new Mushroom(),
				new RedPepper());
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}
}
