package objects;

import interfaces.Ingredient;

/**
 * Created by hnastevska on 9/21/2016.
 */
public class VanillaFrosting implements Ingredient {
    @Override
    public void makeFrosting(String ingredient, double quantity) {
        System.out.println("Making vanilla frosting with extra ingredient: " + ingredient + " with quantity" + quantity);
    }
}
