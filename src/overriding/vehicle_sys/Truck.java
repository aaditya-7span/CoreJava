package overriding.vehicle_sys;

public class Truck extends Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Starting a truck");
    }
}
