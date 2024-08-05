public class App {
    public static void main(String[] args) throws Exception {
        Notifier notifier=new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        System.out.println("Notification sent on : "+notifier.send());
    }
}
