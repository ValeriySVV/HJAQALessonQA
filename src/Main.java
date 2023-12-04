import com.builder_class.IphoneBuilder;
import com.homework.phone.name.Huawei;
import com.homework.phone.name.Iphone;
import com.homework.phone.name.Nokia;
import com.homework.phone.name.Samsung;
import com.homework.phone.name.models.GalaxyS;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {

        Samsung samsung = new Samsung("Android", "Smart", 30, 15000, "Smart", true);

        samsung.security(" PIN 0000");
        samsung.faceId(true);
        samsung.soundCall();
        samsung.soundSms();
        System.out.println(samsung);

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
                System.out.println(iphone);



        var nokia = new Nokia("Android", "Smart", 20, 10000, 2020);

                nokia.security(" password 0000");
                samsung.faceId(false);
                System.out.println(nokia);

        var huawei = new Huawei("Android", "Smart", 20, 5000, "Chine");
                System.out.println(huawei);

        GalaxyS galaxy = new GalaxyS("Android", "Smart", 20, 10000, "Smart", true, "J6");
                System.out.println(galaxy);





    }
}