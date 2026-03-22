package strategy.resolved;

class ExpressShipping implements IShippingCalculator {
    @Override
    public double calculate(double orderValue) {
        return 40.0;
    }
}
