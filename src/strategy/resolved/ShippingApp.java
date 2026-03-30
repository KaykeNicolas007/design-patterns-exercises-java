package strategy.resolved;

public class ShippingApp {
    public static void main(String[] args) {
        Order order1 = new Order(200.0);
        Order order2 = new Order(500.0);

        CheckoutService checkoutStandard = new CheckoutService(new StandardShipping(), order1);
        CheckoutService checkoutFree = new CheckoutService(new FreeShipping(), order1);
        CheckoutService checkoutExpress = new CheckoutService(new ExpressShipping(), order2);

        System.out.println("Order total 1: $ " + checkoutStandard.finalizeOrder());
        System.out.println("Order total 2: $ " + checkoutExpress.finalizeOrder());
        System.out.println("Order total 3: $ " + checkoutFree.finalizeOrder());
    }
}
