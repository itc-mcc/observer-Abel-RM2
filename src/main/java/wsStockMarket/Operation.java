package wsStockMarket;

public class Operation {
    private final Trader trader;
    private final Stock stock;
    private final String tipo_transaccion;
    private final double precio;

    public Operation(Trader t, Stock s, String tipo_transaccion, double precio) {
        this.trader = t;
        this.stock = s;
        this.tipo_transaccion = tipo_transaccion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "trader=" + trader +
                ", stock=" + stock +
                ", tipo_transaccion='" + tipo_transaccion + '\'' +
                ", precio=" + precio +
                '}';
    }

    public Trader getTrader() {
        return trader;
    }

    public Stock getStock() {
        return stock;
    }

    public String getTipo_transaccion() {
        return tipo_transaccion;
    }

    public double getPrecio() {
        return precio;
    }
}
