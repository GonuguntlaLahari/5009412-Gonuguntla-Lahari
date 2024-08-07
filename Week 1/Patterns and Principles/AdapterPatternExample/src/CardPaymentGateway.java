public class CardPaymentGateway {
    void process(){
        System.out.println("Credit Card Payment is Processing ...");
    }
    void success(){
        System.out.println("Credit Card Payment is Successful ...");
    }
    void moneySent(int rupees){
        System.out.println("Rupees "+rupees+" has been debited from Credit Card.");
    }
}
