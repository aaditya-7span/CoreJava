package enum_demo.user_role_sys;

public class User {
    private String name;
    private UserRole role;

    public User(String name, UserRole role) {
        this.name = name;
        this.role = role;
    }

    public void accessDashboard() {
        switch (role) {
            case ADMIN:
                System.out.println(name + " has full access of dashboard.");
                break;
            case CUSTOMER:
                System.out.println(name + " can view and purchase products.");
                break;
            case GUEST:
                System.out.println(name + " can browse but needs to log in to purchase.");
                break;
        }
    }
}
