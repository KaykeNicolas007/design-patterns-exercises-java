package singleton;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        OrderService orderService = new OrderService();

        loginService.login("ana");
        orderService.createOrder("PED-1001");

        System.out.println("Login Service HashCode: " + loginService.getConfig().hashCode());
        System.out.println("Order Service HashCode: " + orderService.getConfig().hashCode());
        System.out.println("Are the same object? " + loginService.getConfig().isEquals(orderService.getConfig()));
    }
}
