package factory_method.unresolved;

public class SmsNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("[SMS] " + message);
    }
}
