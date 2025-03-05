package overloading;

//Changing Data Types of the Arguments
public class PaymentService {

    public void processPayment(int amountInCents) {
        double amountInDollars = amountInCents / 100.0;
        System.out.println("Processing payment of " + amountInDollars + " cents");
    }

    public void processPayment(double amountInDollars) {
        System.out.println("Processing payment of " + amountInDollars + " cents");
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.processPayment(1500);
        paymentService.processPayment(15.00);
<<<<<<< HEAD

=======
>>>>>>> 47af073910e313be0a549606d9f2db0f99ec7850
    }
}
