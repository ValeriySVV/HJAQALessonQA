public class Galaxy extends Samsung{

  private String modelGalaxy = "J6";

    public Galaxy(String os, String type, int size, int price, boolean usability, String modelGalaxy) {
        super(os, type, size, price, usability);
        this.modelGalaxy = modelGalaxy;
    }

    public void kind(String kind) {
        System.out.println("This is: " + kind + "phone");
    }

    public String getModelGalaxy() {
        return modelGalaxy;
    }

    public void setModelGalaxy(String modelGalaxy) {
        this.modelGalaxy = modelGalaxy;
    }
}
