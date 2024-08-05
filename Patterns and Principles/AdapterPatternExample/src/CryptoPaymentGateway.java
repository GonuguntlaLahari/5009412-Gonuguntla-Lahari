public class CryptoPaymentGateway {
    void process(){
        System.out.println("Crypto Payment is Processing ...");
    }
    void success(){
        System.out.println("Crypto Payment is Successful ...");
    }
    void moneySent(int rupees){
        System.out.println("Rupees "+rupees+" has been sent using BitCoin.");
    }
}
