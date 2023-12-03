public class Iphone extends Phone{

   private int version;
    private String color;

    public Iphone(String os, String type,int size, int price, String color, int version) {
        super(os, type, size, price);
        this.color = color;
        this.version = version;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "version=" + version +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void soundSms() {

    }

    @Override
    public void soundCall() {

    }
}

