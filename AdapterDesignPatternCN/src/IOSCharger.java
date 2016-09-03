/**
 * Created by hnastevska on 8/17/2016.
 */
public class IOSCharger implements UniversalCharger {
    @Override
    public void chargeIOS(String phoneName) {
        System.out.println("Charging Iphone: " + phoneName);
    }

    @Override
    public void chargeAndroid(String phoneName) {
        //do nothing
    }
}
