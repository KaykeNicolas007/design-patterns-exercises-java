package adapter.unresolved;

public class PaymentApp {
    public static void main(String[] args) {
        CheckoutService creditCardCheckout =
                new CheckoutService(new CreditCardProcessor());

        creditCardCheckout.checkout(150.0);

        PayPalSDK paypal = new PayPalSDK();
        BitcoinAPI bitcoin = new BitcoinAPI();
    }
}
