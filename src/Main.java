// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();
        Nokia nokia = new Nokia();
        Huawei huawei = new Huawei();
        Galaxy galaxy = new Galaxy();

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

        Iphone iphone1 = new Iphone("Red");
        System.out.println("Iphone color is:" + iphone1.color);

        System.out.println(galaxy.getModelGalaxy());









    }
}