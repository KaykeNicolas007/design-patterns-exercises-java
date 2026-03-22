package strategy.unresolved;

class StandardShipping implements IShippingCalculator {
    @Override
    public double calculate(double orderValue) {
        return 20.0;
    }
}
