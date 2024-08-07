public class App {
    public static void main(String[] args) throws Exception {
        PaymentProcessor ca=new CardAdapter(1500);
        ca.processPayment();
        ca.amount();
        ca.success();
        
        System.out.println();

        PaymentProcessor cya=new CryptoAdapter(1500000);
        cya.processPayment();
        cya.amount();
        cya.success();

        System.out.println();

        PaymentProcessor upia=new UPIAdapter(25736);
        upia.processPayment();
        upia.amount();
        upia.success();
    }
}
