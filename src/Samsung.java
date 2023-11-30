public class Samsung extends Phone{

    private String design;
    String usability;

      public static void sound(String sound) {
        System.out.println("Samsung sound: " + sound);
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }
    @Override
    public void sms() {
        System.out.println("SMS call - Dzin");
    }

}
