package enum_demo.order_status_manage;

class Order {
    private int orderId;
    private OrderStatus status;

    public Order(int orderId) {
        this.orderId = orderId;
        this.status = OrderStatus.PLACED; // Default status
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
        System.out.println("Order " + orderId + " status " + status);
    }

    public OrderStatus getStatus() {
        return status;
    }
}
