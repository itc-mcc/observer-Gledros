package wsStockMarket;

public interface Observer {
    void update(String t, String tipo_transaccion, String stock, double precio);
}
