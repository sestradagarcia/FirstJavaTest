package VehicleInherticance;

public class Motorbike  extends Vehicle{
    private int maxSpeed;

    Motorbike( String brand, int maxSpeed){
        super(brand);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Brand of this motorbike is " + super.getBrand();
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("A motorbike with max speed: " + maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
