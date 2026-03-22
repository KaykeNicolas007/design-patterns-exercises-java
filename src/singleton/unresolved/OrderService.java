package singleton.unresolved;

public class OrderService {
    private final AppConfig config;

    public OrderService() {
        this.config = new AppConfig();
    }

    public void createOrder(String orderId) {
        System.out.println("[" + config.get("app.environment") + "] Order created: " + orderId);
    }
}
