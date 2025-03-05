package abstract_and_interface.payment_sys;

public class Demo {
    public static void main(String[] args) {
        PaymentGateway paymentGateway1=new CreditCardPayment();
        PaymentGateway paymentGateway2=new UPIPayment();

        paymentGateway1.processPayment(2000);
        paymentGateway2.processPayment(120);
    }
}
