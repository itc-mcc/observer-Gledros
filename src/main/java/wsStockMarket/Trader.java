package wsStockMarket;

public class Trader implements Observer {
    private String nombre;
    private StockMarket mercado_acciones;

	public Trader(String nombre, StockMarket mercado_acciones) {
        this.nombre = nombre;
        this. mercado_acciones = mercado_acciones;
	}
    
    public void update(String t, String tipo_transaccion, String stock, double precio) {
        String str = nombre + ":The latest trade is Trader:" + t + 
                            " " + tipo_transaccion + " $" + precio + " Stock: " + stock.toString();
        mercado_acciones.transaction_log += str + "\n";
    }

    public String toString() {
        return nombre;
    }
}