// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {

        Samsung samsung = new Samsung("Android", "Smart", 30, 15000, "Smart", true);

        samsung.security(" PIN 0000");
        samsung.faceId(true);
        samsung.soundCall();
        samsung.soundSms();

        Iphone iphone = new IphoneBuilder()
                .setOs("iOS")
                .setType("Smart")
                .setSize(25)
                .setPrice(20000)
                .setColor("Green")
                .setVersion(13)
                .createIphone();
        System.out.println(iphone.toString());

        iphone.soundCall();
        iphone.soundSms();


        var nokia = new Nokia("Android", "Smart", 20, 10000, 2020);

                nokia.security(" password 0000");
                samsung.faceId(false);

        var huawei = new Huawei("Android", "Smart", 20, 5000, "Chine");
        GalaxyS galaxy = new GalaxyS("Android", "Smart", 20, 10000, "Smart", true, "J6");





    }
}