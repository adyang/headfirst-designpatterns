package sync;

public class SynchronizedSingleton {
	private static SynchronizedSingleton uniqueInstance;

	private SynchronizedSingleton() {
	}

	public static synchronized SynchronizedSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SynchronizedSingleton();
		}
		return uniqueInstance;
	}

	public String getDescription() {
		return "I'm a thread safe synchronized Singleton!";
	}
}
