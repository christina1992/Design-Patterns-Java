/**
 * Created by hnastevska on 8/18/2016.
 */
public class ChargerDemo {
    public static void main(String... args) {
        GlobalChargerAdapter globalAdapter = new GlobalChargerAdapter();
        globalAdapter.charge("ios", "IPhone5");
        globalAdapter.charge("android", "HuaweiP7");
        globalAdapter.charge("windows", "NokiaLumia");
    }
}
