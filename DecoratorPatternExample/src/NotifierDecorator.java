public abstract class NotifierDecorator implements Notifier {

    Notifier decoratedNotifier;
    public NotifierDecorator(Notifier decoratedNotifier){
        this.decoratedNotifier=decoratedNotifier;
    }
    
}
