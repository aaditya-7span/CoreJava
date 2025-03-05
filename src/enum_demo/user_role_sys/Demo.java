package enum_demo.user_role_sys;

public class Demo {
    public static void main(String[] args) {
        User admin = new User("vijay", UserRole.ADMIN);
        User customer = new User("ram", UserRole.CUSTOMER);
        User guest = new User("mihir", UserRole.GUEST);

        admin.accessDashboard();
        customer.accessDashboard();
        guest.accessDashboard();
    }
}
