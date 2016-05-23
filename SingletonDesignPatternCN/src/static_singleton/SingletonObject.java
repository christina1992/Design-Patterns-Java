package static_singleton;

public class SingletonObject {
	private static SingletonObject uniqueInstance = new SingletonObject();

	private SingletonObject() {
	}

	public static SingletonObject getInstance() {
		return uniqueInstance;
	}

	// other useful methods here
	public String getDescription() {
		return "This is a statically initialized Singleton!";
	}
}
