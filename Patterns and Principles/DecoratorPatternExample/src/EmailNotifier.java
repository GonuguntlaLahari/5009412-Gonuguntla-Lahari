public class EmailNotifier implements Notifier {
    public EmailNotifier(){
        System.out.println("EMAIL Sent..!");
    }
    @Override
    public String send() {
        return "Email";
    }
    
}
