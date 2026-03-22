package strategy.unresolved;

public class CheckoutService {
    public double calculateShipping(Order order, String shippingType) {
        if ("standard".equalsIgnoreCase(shippingType)) {
            return new StandardShipping().calculate(order.getTotal());
        } else if ("express".equalsIgnoreCase(shippingType)) {
            return new ExpressShipping().calculate(order.getTotal());
        } else if ("free".equalsIgnoreCase(shippingType)) {
            return new FreeShipping().calculate(order.getTotal());
        } else {
            throw new IllegalArgumentException("Invalid shipping type: " + shippingType);
        }
    }

    public double finalizeOrder(Order order, String shippingType) {
        double shippingCost = calculateShipping(order, shippingType);
        return order.getTotal() + shippingCost;
    }
}
