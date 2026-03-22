package factory_method.resolved;

public class EmailNotification implements INotification{
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] " + message);
    }
}
