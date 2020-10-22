package wsStockMarket;

public class Stock implements Subject {
    String tipo;
    double precio_inicial;
    StockMarket mercado_acciones;

	public Stock(String tipo, double precio_inicial, StockMarket mercado_acciones) {
        this.tipo = tipo;
        this.precio_inicial = precio_inicial;
        this.mercado_acciones = mercado_acciones;
    }
    
    

    
}