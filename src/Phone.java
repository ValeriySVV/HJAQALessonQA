public class Phone {

    private String model;
    static String os;
    String type;
    int size;
    int price;

    public static void sound(String modelPhone) {
        System.out.println("We like: " + modelPhone);
    }

    public void sms() {
        System.out.println("SMS call - Pip");
    }
}




