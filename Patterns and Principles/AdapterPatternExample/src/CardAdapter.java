public class CardAdapter implements PaymentProcessor {
    CardPaymentGateway cpg=new CardPaymentGateway();
    int r;
    public CardAdapter(int r){
        this.r=r;
    }
    public void processPayment(){
        cpg.process();
    }
    public void success(){
        cpg.success();
    }
    public void amount(){
        cpg.moneySent(r);
    }
}
