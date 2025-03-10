package threading_demo.threadclass_demo;

class TicketBooking extends Thread {
    private static int availableTickets = 5;  // Shared resource

    public synchronized void bookTicket(String name) {
        if (availableTickets > 0) {
            availableTickets--;
            System.out.println(name + " booked a ticket.");
        } else {
            System.out.println(name + " tried to book but tickets are sold out.");
        }
    }

    public void run() {
        bookTicket(Thread.currentThread().getName());
    }
}