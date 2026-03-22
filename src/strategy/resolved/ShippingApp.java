package strategy.resolved;

public class ShippingApp {
    public static void main(String[] args) {
        CheckoutService checkoutStandard = new CheckoutService(new StandardShipping());
        CheckoutService checkoutFree = new CheckoutService(new FreeShipping());
        CheckoutService checkoutExpress = new CheckoutService(new ExpressShipping());

        Order order1 = new Order(200.0);
        Order order2 = new Order(500.0);

        System.out.println("Order total 1: $ " + checkoutStandard.finalizeOrder(order1));
        System.out.println("Order total 2: $ " + checkoutExpress.finalizeOrder(order2));
        System.out.println("Order total 3: $ " + checkoutFree.finalizeOrder(order2));
    }
}
