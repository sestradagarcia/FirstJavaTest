package VehicleInherticance;

import java.util.ArrayList;
import java.util.List;
public class Garage {
    List<Vehicle> vehicles= new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(int id) {
        vehicles.removeIf(vehicle -> vehicle.getId() == id);
        System.out.println("\nVehicle with id " + id + " was removed");
    }

    public void displayVehiclesInside() {
        System.out.print("\nThe vehicles in this garage are: ");
        for (Vehicle v : vehicles) {
            System.out.print(v.toString() + "  and has id " + v.getId() + " , ");
        }
    }

    /*public void bill() {
        for (Vehicle v : vehicles) {
            if (v instanceof Car) {
                v.setPrice(2000 * ((Car) v).getSeats());
            } else if (v instanceof Motorbike) {
                v.setPrice(4 * ((Motorbike) v).getMaxSpeed());
            } else if (v instanceof Plane) {
                v.setPrice(10000 * 200000);
            }
        }
    }*/

    public void removeVehicleByType(String className ) {
        vehicles.removeIf(vehicle -> (vehicle.getClass().getSimpleName()).equals(className));
    }





}
