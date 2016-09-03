/**
 * Created by hnastevska on 8/19/2016.
 */
public class FacadeDemo {
    public static void main(String... args) {
        IceCreamMaker icecreamMaker = new IceCreamMaker();

        icecreamMaker.makeBananaIcecream();
        icecreamMaker.makeChocolateIcecream();
        icecreamMaker.makeVanillaIcecream();
    }
}
