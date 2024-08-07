public class App {
    public static void main(String[] args) throws Exception {
        StockMarket stockMarket=new StockMarket();

        Observer ob1=new MobileApp("Soham");
        Observer ob2=new MobileApp("Harsh");
        Observer ob3=new WebApp("Akash");

        stockMarket.register(ob1);
        stockMarket.register(ob2);
        stockMarket.register(ob3);

        stockMarket.setStockPrice(100.00);

        stockMarket.deregister(ob3);

        stockMarket.setStockPrice(111.00);
    }
}
