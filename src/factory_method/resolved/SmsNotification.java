package factory_method.resolved;

public class SmsNotification implements INotification{
    @Override
    public void send(String message) {
        System.out.println("[SMS] " + message);
    }
}
