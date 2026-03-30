package strategy.resolved;

public class CheckoutService {
    IShippingCalculator shippingType;
    Order order;

    public CheckoutService(IShippingCalculator newShippingType, Order newOrder){
        shippingType = newShippingType;
        order = newOrder;
    }

    public double calculateShipping(){
        return shippingType.calculate(order.getTotal());
    }

    public double finalizeOrder() {
        double shippingCost = calculateShipping();
        return order.getTotal() + shippingCost;
    }
}
