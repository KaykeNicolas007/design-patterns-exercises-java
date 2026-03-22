package adapter.resolved;

public class CheckoutService {
    private IPaymentProcessor processor;

    public CheckoutService(IPaymentProcessor processor) {
        this.processor = processor;
    }

    public void checkout(double amount) {
        processor.pay(amount);
    }
}
