package singleton;

public class OrderService {
    private final AppConfig config;

    public OrderService() {
        this.config = AppConfig.getInstance();
    }

    public void createOrder(String orderId) {
        System.out.println("[" + config.get("app.environment") + "] Order created: " + orderId);
    }

    public AppConfig getConfig(){
        return config;
    }
}
