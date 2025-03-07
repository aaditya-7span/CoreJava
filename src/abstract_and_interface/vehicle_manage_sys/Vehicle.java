package abstract_and_interface.vehicle_manage_sys;

public abstract class Vehicle {
    int speed;
    int fuelCapacity;

    public Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }
    abstract void start();

    void stop(){
        System.out.println("Vehicle stopped");
    }
}
