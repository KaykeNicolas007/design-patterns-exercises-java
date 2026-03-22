package factory_method;

public class PushNotification implements INotification{
    @Override
    public void send(String message) {
        System.out.println("[PUSH] " + message);
    }
}
