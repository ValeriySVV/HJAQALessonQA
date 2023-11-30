public class Iphone extends Phone{

    public Iphone(String color) {
        this.color = color;
    }

   private int version;
    String color;

    public Iphone() {

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

