package oops_concept.polymorpism.payment_sys;

public class Demo {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.makePayment();
        payment = new PayPalPayment();
        payment.makePayment();
    }
}

