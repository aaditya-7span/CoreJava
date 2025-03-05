package overloading;

//Changing the Number of Parameters
public class NotificationService {

    public void sendNotification(String message) {
        System.out.println("Notification: " + message);
    }

    public void sendNotification(String message, String phoneNumber, String email) {
        System.out.println("Notification: " + message);
        System.out.println("SMS to: " + phoneNumber);
        System.out.println("Email to: " + email);
    }

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        notificationService.sendNotification("account is blocked");
<<<<<<< HEAD

=======
>>>>>>> 47af073910e313be0a549606d9f2db0f99ec7850
        notificationService.sendNotification("your consultant details ", "34567876543", "amit@gmail.com");
    }
}
