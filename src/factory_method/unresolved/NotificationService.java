package factory_method.unresolved;

public class NotificationService {
    public void notifyUser(String type, String message) {
        INotification notification;

        if ("email".equalsIgnoreCase(type)) {
            notification = new EmailNotification();
        } else if ("sms".equalsIgnoreCase(type)) {
            notification = new SmsNotification();
        } else if ("push".equalsIgnoreCase(type)) {
            notification = new PushNotification();
        } else {
            throw new IllegalArgumentException("Tipo de notificação inválido: " + type);
        }

        notification.send(message);
    }
}

