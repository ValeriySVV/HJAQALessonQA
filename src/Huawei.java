public class Huawei extends Phone{

    private String country;

    public void kindOfBrowser(String indOfBrowser) {
        System.out.println("Browser is: " + indOfBrowser);
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
