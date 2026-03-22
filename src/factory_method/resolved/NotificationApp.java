package factory_method.resolved;

public class NotificationApp {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        service.notifyUser("email", "Your order was confirmed.");
        service.notifyUser("sms", "Your verification code is 123456.");
        service.notifyUser("push", "You received a new notification.");
    }
}
