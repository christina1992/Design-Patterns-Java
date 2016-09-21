package main;

import objects.CakeFrosting;
import objects.Frosting;
import objects.RedVelvetFrosting;
import objects.VanillaFrosting;

/**
 * Created by hnastevska on 9/21/2016.
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Frosting redVelvet = new CakeFrosting(new RedVelvetFrosting(), "cherries", 3);
        Frosting vanilla = new CakeFrosting(new VanillaFrosting(), "sprinkles", 2);

        redVelvet.make();
        vanilla.make();
    }
}
