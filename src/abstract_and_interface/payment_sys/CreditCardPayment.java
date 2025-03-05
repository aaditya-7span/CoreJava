package abstract_and_interface.payment_sys;

public class CreditCardPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of "+amount);
    }
}
