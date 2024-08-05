public class App {
    public static void main(String[] args) throws Exception {
        PaymentContext paymentContext=new PaymentContext(new CreditCardPayment());
        paymentContext.performPay();// Out: Credit Card Payment

        paymentContext.setPaymentStrategy(new PayPalPayment());
        paymentContext.performPay(); // Out: PayPalPayment
    }
}
