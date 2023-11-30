public class Iphone extends Phone{

   private int version;
    String color;

    public Iphone(String os, String type,int size, int price, String color) {
        super(os, type, size, price);
        this.color = color;
    }

    public Iphone(String os, String type,int size, int price) {
        super(os, type, size, price);

    }
    public static void camera(int camera) {
        System.out.println("Camera size is: " + camera);
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }


}

