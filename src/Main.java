// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Samsung samsung = new Samsung("Android", "Smart", 30, 15000);
        Iphone iphone = new Iphone("iOS", "Smart", 25, 20000);
        Nokia nokia = new Nokia("Android", "Smart", 20, 10000);
        Huawei huawei = new Huawei("Android", "Smart", 20, 5000);
        Galaxy galaxy = new Galaxy("Android", "Smart", 20, 10000);

       samsung.os = "Android";
       iphone.price = 20000;

        Samsung.sound("Pinpinpin");
        Iphone.camera(15);

        System.out.println("OS Samsung is " + Samsung.os);
        System.out.println("OS Iphone is " + iphone.price);

        samsung.sms();
        iphone.sms();
        galaxy.sms();
        nokia.sms();

       System.out.println(galaxy.getModelGalaxy());










    }
}