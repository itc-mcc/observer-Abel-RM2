package wsStockMarket;

public class StockMarket {

	public StockMarket() {

	}
	public void register(Trader t, Stock s) {
		s.addObserver(t);
	}

	public String trade(Trader t, Stock s, String tipo_transaccion, double precio) {
		s.setChange();
		Operation operation = new Operation(t, s, tipo_transaccion, precio);
		return s.notifyObservers(operation);
	}
    
}