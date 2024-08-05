public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier decoratedNotifier) {
        super(decoratedNotifier);
        System.out.println("Slack Notif Sent..!");
    }

    @Override
    public String send() {
        return decoratedNotifier.send()+", Slack";
    }
    
}
