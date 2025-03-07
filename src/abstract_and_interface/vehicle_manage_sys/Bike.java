package abstract_and_interface.vehicle_manage_sys;

public class Bike extends Vehicle{

    public Bike(int speed, int fuelCapacity) {
        super(speed, fuelCapacity);
    }

    @Override
    void start() {
        System.out.println("Bike started");
    }
}
