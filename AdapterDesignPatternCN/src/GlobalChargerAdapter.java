/**
 * Created by hnastevska on 8/18/2016.
 */
public class GlobalChargerAdapter implements Charger {
    Charger charger;

    @Override
    public void charge(String phoneType, String phoneName) {
        if (phoneType.equalsIgnoreCase("android") || phoneType.equalsIgnoreCase("ios")) {
            charger = new ChargerAdapter(phoneType);
            charger.charge(phoneType, phoneName);
        } else {
            System.out.println("Can not charge this type of phone");
        }
    }
}
