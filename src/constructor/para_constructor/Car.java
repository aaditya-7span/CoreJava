
package constructor.para_constructor;

class Car {
    String model;
    double price;

    Car(String model, double price) {    // Parameterized constructor
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Car Model: " + model + ", Price: " + price);
    }
}