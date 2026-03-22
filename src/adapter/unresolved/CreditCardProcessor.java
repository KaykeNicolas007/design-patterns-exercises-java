package adapter.unresolved;

public class CreditCardProcessor implements IPaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Payment $" + amount + " with credit card.");
    }
}
