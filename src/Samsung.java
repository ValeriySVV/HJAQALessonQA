public class Samsung extends Phone{

    private String design;
    String usability;

    public Samsung(String os, String type,int size, int price) {
        super(os, type, size, price);

    }

    public static void sound(String sound) {
        System.out.println("Samsung sound: " + sound);
    }

    public String getDesign() {
        return design;
    }



    @Override
    public void sms() {
        System.out.println("SMS call - Dzin");
    }


}
