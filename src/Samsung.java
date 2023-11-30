public class Samsung extends Phone{

    private String design;
    boolean usability;

    public Samsung(String os, String type,int size, int price, boolean usability) {
        super(os, type, size, price);
        this.usability = usability;

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
