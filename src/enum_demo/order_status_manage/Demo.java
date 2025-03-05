package enum_demo.order_status_manage;

public class Demo {
    public static void main(String[] args) {
        Order order1 = new Order(101);

        order1.updateStatus(OrderStatus.SHIPPED);
        order1.updateStatus(OrderStatus.DELIVERED);

        System.out.println("Final Order Status: " + order1.getStatus());

    }
}
