package factory_method.unresolved;

public class EmailNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] " + message);
    }
}
