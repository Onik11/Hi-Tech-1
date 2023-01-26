package exam2;

public class Car {
    private int year;
    private double price;
    private String model;

    public Car(int year, double price, String model) {
        this.year = year;
        this.price = price;
        this.model = model;
    }
    public Car(){

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
