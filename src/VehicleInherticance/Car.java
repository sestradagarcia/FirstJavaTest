package VehicleInherticance;

public class Car  extends Vehicle{
    private int seats;

    Car( String brand, int seats){
        super(brand);
        this.seats = seats;
    }
    @Override
    public String toString() {
        return "Brand of this car is " + super.getBrand();
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("A car with " + seats + " seats");
    }
    @Override
    public double calcBill(){
        return 120.0;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
