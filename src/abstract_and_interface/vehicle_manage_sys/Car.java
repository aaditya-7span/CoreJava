package abstract_and_interface.vehicle_manage_sys;

public class Car extends Vehicle{

    public Car(int speed, int fuelCapacity) {
        super(speed, fuelCapacity);
    }

    @Override
    void start() {
        System.out.println("Car started");
    }
}
