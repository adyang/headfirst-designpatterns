package pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ingredient.Cheese;
import ingredient.Clams;
import ingredient.Dough;
import ingredient.Pepperoni;
import ingredient.Sauce;
import ingredient.Veggie;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	List<Veggie> veggies = new ArrayList<>();
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		String display = displayName()
				+ displayWithNewlineIfNotNull(dough)
				+ displayWithNewlineIfNotNull(sauce)
				+ displayWithNewlineIfNotNull(cheese)
				+ displayListWithNewlineIfNotEmpty(veggies, ", ")
				+ displayWithNewlineIfNotNull(clam)
				+ displayWithNewlineIfNotNull(pepperoni);

		return display;
	}

	private String displayListWithNewlineIfNotEmpty(List<?> list,
			String delimiter) {
		if (list.isEmpty())
			return "";
		else
			return list.stream().map(Object::toString)
					.collect(Collectors.joining(delimiter)) + "\n";
	}

	private String displayName() {
		return "---- " + name + " ----\n";
	}
	
	private String displayWithNewlineIfNotNull(Object obj) {
		if (obj == null)
			return "";
		else
			return obj + "\n";
	}
}
