package adapter.unresolved;

public class PayPalSDKPaymentAdapter implements IPaymentProcessor {
    private PayPalSDK paypal;

    public PayPalSDKPaymentAdapter(){
        paypal = new PayPalSDK();
    }

    @Override
    public void pay(double amount) {
        paypal.sendPayment(amount);
    }
}
