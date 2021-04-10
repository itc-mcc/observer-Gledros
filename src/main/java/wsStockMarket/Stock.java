package wsStockMarket;

import java.util.ArrayList;

public class Stock implements Subject {
    String tipo;
    double precio_inicial;
    StockMarket mercado_acciones;
    ArrayList<Observer> observers;

    private String last_trader;
    private String last_transaction;
    private double last_price;

	public Stock(String tipo, double precio_inicial, StockMarket mercado_acciones) {
        this.tipo = tipo;
        this.precio_inicial = precio_inicial;
        this.mercado_acciones = mercado_acciones;
        observers = new ArrayList<Observer>();
    }

    public boolean registerObserver(Observer obs) {
        return observers.add(obs);
    }

    public boolean removeObserver(Observer obs) {
        return observers.remove(obs);
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(last_trader, last_transaction, tipo, last_price);
        }
    }

    public void transaction(Trader t, String tipo_transaccion, double precio) {
        last_trader = t.toString();
        last_transaction = tipo_transaccion;
        last_price = precio;
        notifyObservers();
    }

}