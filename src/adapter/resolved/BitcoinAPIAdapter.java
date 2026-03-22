package adapter.resolved;

public class BitcoinAPIAdapter implements IPaymentProcessor {
    private BitcoinAPI bitcoin;

    public BitcoinAPIAdapter() {
        bitcoin = new BitcoinAPI();
    }

    @Override
    public void pay(double amount) {
        bitcoin.makeTransaction(amount);
    }
}
