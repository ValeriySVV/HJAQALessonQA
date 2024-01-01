import com.homework.phone.phones.name.Samsung;
import com.homework.phone.phones.name.models.GalaxyA;
import com.homework.phone.phones.name.models.GalaxyFlip;
import com.homework.phone.phones.name.models.GalaxyM;
import com.homework.phone.phones.name.models.GalaxyS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static final String FILE_NAME = "resources/samsungModels.txt";
    private static java.util.stream.Collectors Collectors;

    static String[] readFileUsingScanner(String fileName) {

        ArrayList<String> data = new ArrayList<String>();

        var file = new File(fileName);
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        boolean finished = false;
        do {
            try {
                data.add(scanner.nextLine());
            } catch (NoSuchElementException e) {
                finished = true;
            }

        } while (!finished);


        scanner.close();
        return Arrays.copyOf(data.toArray(), data.size(), String[].class);
    }

    private static List<Samsung> createSamsungObjects(String[] data) {
        List<Samsung> samsungs = new Stack<>();
        //String[] data = readFileUsingScanner(FILE_NAME);
        //System.out.println(data);
        //createSumsungObjects(data);
        getSamsungsData(data, samsungs);
        return samsungs;
    }

    private static void getSamsungsData(String[] data, List<Samsung> samsungs) {
        //List<Samsung> samsungs = new LinkedList<>();
        //getSamsungData(data, samsungs);
        //Stream<Samsung> stream = samsungs.stream();
        for (int i = 1; i < data.length; i++) {
            var pieces = data[i].split(";");
            Samsung samsung = null;
            //System.out.println(data);
            switch (pieces[4].toLowerCase()) {
                case "galaxyS":
                    samsung = new GalaxyA(Integer.parseInt(pieces[0]), pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Integer.parseInt(pieces[5]), Boolean.parseBoolean(pieces[6]));
                    break;
                case "galaxyM":
                    samsung = new GalaxyFlip(Integer.parseInt(pieces[0]), pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Integer.parseInt(pieces[5]), Boolean.parseBoolean(pieces[6]));
                    break;
                case "galaxyA":
                    samsung = new GalaxyM(Integer.parseInt(pieces[0]), pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Integer.parseInt(pieces[5]), Boolean.parseBoolean(pieces[6]));
                    break;
                case "galaxyFlip":
                    samsung = new GalaxyS(Integer.parseInt(pieces[0]), pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Integer.parseInt(pieces[5]), Boolean.parseBoolean(pieces[6]));
                    break;
                default:
                    samsung = new Samsung(Integer.parseInt(pieces[0]), pieces[1], pieces[2], Integer.parseInt(pieces[3]),
                            Integer.parseInt(pieces[5]), Boolean.parseBoolean(pieces[6]));
                    break;

            }
            samsungs.add(samsung);
            //System.out.println("Phone characteristics:" + samsung);
        }
    }

    public static void main(String[] args) throws IOException {
        List<Samsung> samsungs = new Stack<>();
        String[] data = readFileUsingScanner(FILE_NAME);
        //System.out.println(data);
        samsungs = createSamsungObjects(data);

        Stream <Samsung> stream = samsungs.stream(); //сортування від більшого до меншого - згідно SortOrder зменшення
        stream

                .sorted((s1, s2) -> (s2.getId() - s1.getId()))
                .forEach(System.out::println);
        System.out.println("Cортування від більшого до меншого - згідно SortOrder зменшення");

        Stream <Samsung> stream1 = samsungs.stream();//пропустити перші SortSkip - 11 і вивести SortOut перших - 17
        stream1

                .filter(samsung -> samsung.getId() > 11 && samsung.getId() <= 29)
                .forEach(System.out::println);
        System.out.println("Пропустити перші SortSkip - 11 і вивести SortOut перших - 17");

        Stream <Samsung> stream2 = samsungs.stream();// Відфільтрувати за значенням довільно вибраного числового поля значення у кількісті FilterOut - 25
        stream2

                .filter(samsung -> samsung.getId() <=26)
                .forEach(System.out::println);
        System.out.println("Відфільтрувати за значенням довільно вибраного числового поля значення у кількісті FilterOut - 25");

/*        Map<Integer, String> samsungsMap  = stream.collect(Collectors.toMap(Samsung::getId, Samsung::getModel)); //Map<Integer, String>, де key = значення поля id
        System.out.println(samsungsMap);*/





    }










 /*       Samsung samsung = new Samsung("Android", "Smart", 30, 15000, "Smart", true);

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
                System.out.println(galaxy);*/

}



