package locking;

public class DoubleCheckedLockingSingleton {
	private volatile static DoubleCheckedLockingSingleton uniqueInstance;

	private DoubleCheckedLockingSingleton() {
	}

	public static DoubleCheckedLockingSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return uniqueInstance;
	}

	public String getDescription() {
		return "I'm a double-checked locking Singleton!";
	}
}
