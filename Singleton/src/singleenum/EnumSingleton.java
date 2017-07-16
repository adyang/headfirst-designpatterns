package singleenum;

public enum EnumSingleton {
	UNIQUE_INSTANCE;

	public String getDescription() {
		return "I'm an Enum Singleton!";
	}
}
