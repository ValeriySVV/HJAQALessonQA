public class Nokia extends Phone{

    private int year;
    public void yearCreate(int yearCreate) {
        System.out.println("Date of create: " + yearCreate);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public void sms(){
        System.out.println("SMS call - Call");
    }
}
