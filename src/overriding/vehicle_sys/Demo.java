package overriding.vehicle_sys;

public class Demo {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        Vehicle myTruck = new Truck();

        myVehicle.startEngine();
        myCar.startEngine();
        myTruck.startEngine();
    }
}
