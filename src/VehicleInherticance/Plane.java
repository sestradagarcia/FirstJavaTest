package VehicleInherticance;

public class Plane  extends Vehicle{
    private int takeOffTime;

    Plane( String brand, int takeOffTime){
        super(brand);
        this.takeOffTime = takeOffTime;
    }

    @Override
    public String toString() {
        return "Brand of this plane is " + super.getBrand();
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("A plane with take off time " + takeOffTime);
    }

    public int getTakeOffTime() {
        return takeOffTime;
    }

    public void setTakeOffTime(int takeOffTime) {
        this.takeOffTime = takeOffTime;
    }
}
