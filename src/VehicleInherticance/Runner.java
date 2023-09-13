package VehicleInherticance;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car("audi", 4);

        Plane plane1 = new Plane("idk", 9);

        Motorbike motorbike1 = new Motorbike("Suzuki", 120);

        Garage garage1 = new Garage();

        /*car1.displayDetails();
        plane1.displayDetails();
        motorbike1.displayDetails();
        System.out.println(plane1.toString());
*/
        /*garage1.addVehicle(car1);
        garage1.addVehicle(plane1);
        garage1.addVehicle(motorbike1);
        garage1.displayVehiclesInside();
        garage1.removeVehicle(1);
        garage1.displayVehiclesInside();
        Car car2 = new Car("kia", 5);
        garage1.addVehicle(car2);
        garage1.displayVehiclesInside();
        garage1.bill();
        System.out.println(car1.getPrice());
        garage1.removeVehicleByType("Car");
        garage1.displayVehiclesInside();*/
        List<Flyable> flyables = new ArrayList<>();

        Bird b1 = new Bird();
        Plane p1 = new Plane("idk", 9);

        flyables.add(b1);
        flyables.add(p1);

        for(Flyable f: flyables){
            System.out.println(f.fly());
        }

    }
}
