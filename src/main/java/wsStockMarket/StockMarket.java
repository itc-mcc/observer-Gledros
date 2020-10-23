package wsStockMarket;

public class StockMarket {

    public String transaction_log;


	public StockMarket() {

    }
    
	public void register(Trader t, Stock s) {
        s.registerObserver(t);
	}

	public String trade(Trader t, Stock s, String tipo_transaccion, double precio) {
        transaction_log = "";
        s.transaction(t, tipo_transaccion, precio);
		return transaction_log;
	}
    
}