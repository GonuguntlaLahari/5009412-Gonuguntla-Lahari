import java.util.ArrayList;

public class StockMarket implements Stock {
    private ArrayList<Observer>observers=new ArrayList<>();
    private double stockPrice;
    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifY() {
        for(Observer observer:observers)
            observer.update(stockPrice);
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer); 
    }
    
    public void setStockPrice(double stockPrice){
        this.stockPrice=stockPrice;
        notifY();
    }
}
