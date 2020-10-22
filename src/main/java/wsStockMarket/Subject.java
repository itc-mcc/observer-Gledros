package wsStockMarket;

public interface Subject {
    boolean registerObserver(Observer obs);
    boolean removeObserver(Observer obs);
    boolean notifyObservers();
}
