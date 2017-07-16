package ingredient.factory;

import java.util.Arrays;
import java.util.List;

import ingredient.BlackOlives;
import ingredient.Cheese;
import ingredient.Clams;
import ingredient.Dough;
import ingredient.Eggplant;
import ingredient.FrozenClams;
import ingredient.MozzarellaCheese;
import ingredient.Pepperoni;
import ingredient.PlumTomatoSauce;
import ingredient.Sauce;
import ingredient.SlicedPepperoni;
import ingredient.Spinach;
import ingredient.ThickCrustDough;
import ingredient.Veggie;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public List<Veggie> createVeggies() {
		return Arrays.asList(new BlackOlives(), new Spinach(), new Eggplant());
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams();
	}

}
