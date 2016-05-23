package classic_singleton;
/*
 * 	Classic Singleton that is not a Thread Safe 
 * 
 */

public class SingletonObject {

	private static SingletonObject uniqueInstance;

	private SingletonObject() {
	}

	public static SingletonObject getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonObject();
		}
		return uniqueInstance;
	}

	public String getDescription() {
		return "This is a classic Singleton object instance.";
	}
}
