package abstract_objects;

public abstract class CakeStore {
	public abstract Cake createCake(String item);

	public Cake orderCake(String type) {
		Cake cake = createCake(type);
		System.out.println("--- Making a " + cake.getName() + " ---");
		cake.prepare();
		cake.bake();
		cake.decorate();
		cake.box();
		return cake;
	}
}
