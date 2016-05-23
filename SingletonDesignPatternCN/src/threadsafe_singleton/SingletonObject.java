package threadsafe_singleton;

public class SingletonObject {
	private static SingletonObject uniqueInstance;

	private SingletonObject() {
	}

	public static synchronized SingletonObject getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonObject();
		}
		return uniqueInstance;

	}

	public String getDescription() {
		return "This is a thread safe Singleton!";
	}
}
