package strategy.unresolved;

class ExpressShipping implements IShippingCalculator {
    @Override
    public double calculate(double orderValue) {
        return 40.0;
    }
}
