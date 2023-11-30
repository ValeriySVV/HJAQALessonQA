public class Huawei extends Phone{

    private String country;

    public Huawei(String os, String type,int size, int price) {
        super(os, type, size, price);
    }

    public void printKindOfBrowser(String printKindOfBrowser) {
        System.out.println("Browser is: " + printKindOfBrowser);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public void sms(){
        System.out.println("SMS call - Vibro");
    }
}
