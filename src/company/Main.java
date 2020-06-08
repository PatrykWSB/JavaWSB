package company;

import company.creatures.Human;
import company.devices.Application;
import company.devices.Phone;

public class Main {
    public static void main(String[] args) {

        Human me = new Human("homo sapiens", 3);
        Phone tel = new Phone("samsung", "ładny", 2006, 200.0, 6.9, true);

        me.tel = tel;
        me.cash = 10000.0;
        Application app1 = new Application("faceook", 0.0);
        Application app2 = new Application("messger", 0.0);
        Application app3 = new Application("tictic", 0.0);
        Application app4 = new Application("cook", 6.66);
        Application app5 = new Application("endobombo", 0.0);
        Application app6 = new Application("cos", 3.5);
        Application app7 = new Application("inna", 1.2);

        try {
            tel.installApp(me, app1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            tel.installApp(me, app3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            tel.installApp(me, app4);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            tel.installApp(me, app6);
        } catch (Exception e) {
            e.printStackTrace();
        }

        tel.isAppInstalled(app1);
        tel.isAppInstalled(app2);
        tel.isAppInstalled2(app4);
        tel.isAppInstalled2(app5);

        tel.allFreeApps();

        System.out.println(tel.allAppsValue());

        tel.appSortAlphabet();
        tel.appSortPrice();

    }
}