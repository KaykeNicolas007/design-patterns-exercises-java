package strategy.resolved;

public class CheckoutService {
    IShippingCalculator shippingType;

    public CheckoutService(IShippingCalculator newShippingType){
        shippingType = newShippingType;
    }

    public double calculateShipping(Order order){
        return shippingType.calculate(order.getTotal());
    }

    public double finalizeOrder(Order order) {
        double shippingCost = calculateShipping(order);
        return order.getTotal() + shippingCost;
    }
}
