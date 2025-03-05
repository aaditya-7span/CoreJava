package abstract_and_interface.vehicle_manage_sys;

public class Demo {
    public static void main(String[] args) {
        Vehicle car= new Car(120,50);
        Vehicle bike=new Bike(80,15);

        car.start();
        bike.start();

        car.stop();
    }
}
