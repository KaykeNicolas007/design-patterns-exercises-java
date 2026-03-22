package strategy.resolved;

class StandardShipping implements IShippingCalculator {
    @Override
    public double calculate(double orderValue) {
        return 20.0;
    }
}
