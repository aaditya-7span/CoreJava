package threading_demo.threadclass_demo;

public class Demo {
    public static void main(String[] args) {
        TicketBooking user1 = new TicketBooking();
        TicketBooking user2 = new TicketBooking();
        TicketBooking user3 = new TicketBooking();
        TicketBooking user4 = new TicketBooking();
        TicketBooking user5 = new TicketBooking();
        TicketBooking user6 = new TicketBooking();

        user1.setName("User1");
        user2.setName("User2");
        user3.setName("User3");
        user4.setName("User4");
        user5.setName("User5");
        user6.setName("User6");

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
        user6.start();
    }
}
