package nonstatic_demo;

class Car {

    {
        System.out.println("non static block");
    }

    static {
        System.out.println("static block");
    }


    String model; // Non-static variable

    Car(String model) {
        System.out.println("constructor");
        this.model = model; // Assign value to instance variable
    }

    void showModel() {
        System.out.println("Car Model: " + model);
    }
}

public class NonStatic {

        public static void main(String[] args) {
            Car car1 = new Car("Tesla Model S");
            Car car2 = new Car("BMW X5");

            car1.showModel(); // Output: Car Model: Tesla Model S
            car2.showModel(); // Output: Car Model: BMW X5
        }
}
