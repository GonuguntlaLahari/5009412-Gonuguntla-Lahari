public class UPIPaymentGateway {
    void process(){
        System.out.println("UPI Payment is Processing ...");
    }
    void success(){
        System.out.println("Payment is Successful ...");
    }
    void moneySent(int rupees){
        System.out.println("Rupees "+rupees+" has been sent through UPI.");
    }
}
