public class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier decoratedNotifier) {
        super(decoratedNotifier);
        System.out.println("SMS Sent..!");
    }

    @Override
    public String send() {
        return decoratedNotifier.send()+", SMS";
    }
    
}
