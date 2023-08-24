package OOP_pr.ex7paymentsapp;

public class Adress {
   private String street;
   private int number;
   private String city;
    // Metode: doar getteri și setteri

    public Adress(String street, int number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", city='" + city + '\'' +
                '}';
    }
}
