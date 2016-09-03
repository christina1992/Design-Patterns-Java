/**
 * Created by hnastevska on 8/17/2016.
 */
public class ChargerAdapter implements Charger {

    UniversalCharger universalCharger;

    public ChargerAdapter(String phoneType) {
        if (phoneType.equalsIgnoreCase("ios")) {
            universalCharger = new IOSCharger();
        } else if (phoneType.equalsIgnoreCase("android")) {
            universalCharger = new AndroidCharger();
        }
    }

    @Override
    public void charge(String phoneType, String phoneName) {
        if (phoneType.equalsIgnoreCase("ios")) {
            universalCharger.chargeIOS(phoneName);
        } else if (phoneType.equalsIgnoreCase("android")) {
            universalCharger.chargeAndroid(phoneName);
        }

    }
}
