/**
 * Created by hnastevska on 8/19/2016.
 */
public class IceCreamMaker {

    IceCream vanilla;
    IceCream chocolate;
    IceCream banana;

    public IceCreamMaker() {
        vanilla = new Vanilla();
        chocolate = new Chocolate();
        banana = new Banana();
    }

    public void makeVanillaIcecream() {
        vanilla.makeIcecream();
    }

    public void makeChocolateIcecream() {
        chocolate.makeIcecream();
    }

    public void makeBananaIcecream() {
        banana.makeIcecream();
    }

}
