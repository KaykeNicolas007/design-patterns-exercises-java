package singleton.unresolved;

public class App {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        OrderService orderService = new OrderService();

        loginService.login("ana");
        orderService.createOrder("PED-1001");
    }
}
