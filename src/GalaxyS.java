public class GalaxyS extends Samsung{

  private String models;

    public GalaxyS(String model, String type, int size, int price, String design, boolean usability, String models) {
        super(model, type, size, price, design, usability);
        this.models = models;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }
}
