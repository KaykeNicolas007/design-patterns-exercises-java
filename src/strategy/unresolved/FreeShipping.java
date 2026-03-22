package strategy.unresolved;

class FreeShipping implements IShippingCalculator {
    @Override
    public double calculate(double orderValue) {
        return 0.0;
    }
}