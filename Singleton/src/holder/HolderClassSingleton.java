package holder;

public class HolderClassSingleton {
	private static class SingletonHolder {
		public static HolderClassSingleton uniqueInstance = new HolderClassSingleton();
	}

	private HolderClassSingleton() {
	}

	public static HolderClassSingleton getInstance() {
		return SingletonHolder.uniqueInstance;
	}

	public String getDescription() {
		return "I'm a Holder Class Singleton!";
	}
}
