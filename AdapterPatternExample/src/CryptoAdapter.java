public class CryptoAdapter implements PaymentProcessor {
    CryptoPaymentGateway cypg=new CryptoPaymentGateway();
    int r;
    public CryptoAdapter(int r){
        this.r=r;
    }
    public void processPayment(){
        cypg.process();
    }
    public void success(){
        cypg.success();
    }
    public void amount(){
        cypg.moneySent(r);
    }
}
