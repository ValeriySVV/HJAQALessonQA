public class Nokia extends  Phone implements Functional{

    private int year;

    public Nokia(String os, String type, int size, int price, int year) {
        super(os, type, size, price);
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void soundSms() {

    }

    @Override
    public void soundCall() {

    }


    @Override
    public void security(String password) {
        System.out.println("Nokia security is" + password);

    }

    @Override
    public void faceId(boolean faceId) {
        Functional.super.faceId(faceId);
    }
}
