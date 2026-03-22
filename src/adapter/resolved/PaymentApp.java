package adapter.resolved;

public class PaymentApp {
    public static void main(String[] args) {
        CheckoutService creditCardCheckout =
                new CheckoutService(new CreditCardProcessor());
        creditCardCheckout.checkout(150.0);

        CheckoutService paypalCheckout = new CheckoutService(new PayPalSDKPaymentAdapter());
        paypalCheckout.checkout(250.0);

        CheckoutService bitcoinCheckout = new CheckoutService(new BitcoinAPIAdapter());
        bitcoinCheckout.checkout(350.0);
    }
}
