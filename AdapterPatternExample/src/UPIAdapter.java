public class UPIAdapter implements PaymentProcessor {
    UPIPaymentGateway upipg=new UPIPaymentGateway();
    int r;
    public UPIAdapter(int r){
        this.r=r;
    }
    public void processPayment(){
        upipg.process();
    }
    public void success(){
        upipg.success();
    }
    public void amount(){
        upipg.moneySent(r);
    }
}
