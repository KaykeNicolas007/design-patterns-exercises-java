package factory_method;

public class NotificationService {
    public void notifyUser(String type, String message) {
        INotification notification = NotificationFactory.createNotification(type);
        notification.send(message);
    }
}

