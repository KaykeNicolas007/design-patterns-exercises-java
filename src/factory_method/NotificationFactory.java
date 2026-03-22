package factory_method;

public class NotificationFactory {
    public static INotification createNotification(String type) {
        if ("email".equalsIgnoreCase(type)) {
            return new EmailNotification();
        } else if ("sms".equalsIgnoreCase(type)) {
            return new SmsNotification();
        } else if ("push".equalsIgnoreCase(type)) {
            return new PushNotification();
        } else {
            throw new IllegalArgumentException("Invalid notification type: " + type);
        }
    }
}
