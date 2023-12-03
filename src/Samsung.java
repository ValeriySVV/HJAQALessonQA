public class Samsung extends Phone implements Functional{

    private final String design;
    boolean usability;

    public Samsung(String model, String type, int size, int price, String design, boolean usability) {
        super(model, type, size, price);
        this.design = design;
        this.usability = usability;
    }

    public String getDesign() {
        return design;
    }

    public boolean isUsability() {
        return usability;
    }

    public void setUsability(boolean usability) {
        this.usability = usability;
    }

    @Override
    public void soundSms() {
        System.out.println("Rock ring");

    }

    @Override
    public void soundCall() {
        System.out.println("Vibro");

    }


    @Override
    public void security(String password) {
        System.out.println("Samsung security is" + password);

    }

    @Override
    public void faceId(boolean faceId) {
        Functional.super.faceId(faceId);
    }
}
