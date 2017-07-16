package eager;

public class EagerSingleton {
	private static final EagerSingleton uniqueInstance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return uniqueInstance;
	}

	public String getDescription() {
		return "I'm an eagerly initialised Singleton!";
	}
}