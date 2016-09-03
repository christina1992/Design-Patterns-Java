/**
 * Created by hnastevska on 8/17/2016.
 */

public class AndroidCharger implements UniversalCharger {

    @Override
    public void chargeIOS(String phoneName) {
        //do nothing
    }

    @Override
    public void chargeAndroid(String phoneName) {
        System.out.println("Charging Android phone: " + phoneName);
    }
}