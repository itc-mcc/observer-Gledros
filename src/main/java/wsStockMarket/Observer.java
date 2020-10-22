package wsStockMarket;

public interface Observer {
    boolean update(String t, String tipo_transaccion, double precio);
}
