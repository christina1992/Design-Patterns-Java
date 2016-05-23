package threadsafe_singleton;

public class RunSingleton {

	public static void main(String[] args) {
		SingletonObject singleton = SingletonObject.getInstance();
		System.out.println(singleton.getDescription());

	}

}
