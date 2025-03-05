package abstract_and_interface.payment_sys;

public class UPIPayment implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of "+amount);
    }
}
