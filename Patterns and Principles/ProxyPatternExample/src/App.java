public class App {
    public static void main(String[] args) throws Exception {
        Image image=new ProxyImage("abc.com");
        Image image2=new ProxyImage("example.com");
        image.display();
        image.display();
        image2.display();
    }
}
