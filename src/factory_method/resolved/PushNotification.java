package factory_method.resolved;

public class PushNotification implements INotification{
    @Override
    public void send(String message) {
        System.out.println("[PUSH] " + message);
    }
}
