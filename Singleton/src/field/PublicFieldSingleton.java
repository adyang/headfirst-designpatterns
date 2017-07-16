package field;

public class PublicFieldSingleton {
	public static final PublicFieldSingleton UNIQUE_INSTANCE = new PublicFieldSingleton();

	private PublicFieldSingleton() {
	}

	public String getDescription() {
		return "I'm a public static final field Singleton!";
	}
}
