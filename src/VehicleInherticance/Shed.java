package VehicleInherticance;
import java.util.List;
import java.util.ArrayList;

public class Shed<T extends Vehicle> {
    private T vehicle;
    List<T> vehicles= new ArrayList<>();
    public void store (T vehicle){
        vehicles.add(vehicle);
    }

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

   public List<T> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<T> vehicles) {
        this.vehicles = vehicles;
    }
}
