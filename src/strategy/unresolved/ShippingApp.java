package strategy.unresolved;

public class ShippingApp {
    public static void main(String[] args) {
        CheckoutService checkout = new CheckoutService();

        Order order1 = new Order(200.0);
        Order order2 = new Order(500.0);

        System.out.println("Order total 1: $ " + checkout.finalizeOrder(order1, "standard"));
        System.out.println("Order total 2: $ " + checkout.finalizeOrder(order2, "express"));
        System.out.println("Order total 3: $ " + checkout.finalizeOrder(order2, "free"));
    }
}
