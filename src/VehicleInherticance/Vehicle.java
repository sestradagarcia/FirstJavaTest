package VehicleInherticance;

public class Vehicle {
    private String brand;
    private static int currentId = 0;
    private int id;

    private int price;
    public Vehicle(String brand){
        this.setId(currentId);
        currentId++;
        this.brand = brand;
    }

    public int generateID(){
        return currentId++;
    }

    public String toString() {
        return "Brand is " + brand;
    }

    void displayDetails() {
        System.out.println("Brand is " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
