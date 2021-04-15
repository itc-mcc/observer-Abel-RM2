package wsStockMarket;

import java.util.ArrayList;

public class Stock implements Subject {
	private boolean change = false;
	private final ArrayList<Trader> observers = new ArrayList<>();
	private final String tipo;

	public Stock(String tipo, double precio_inicial, StockMarket mercado_acciones) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void addObserver(Trader t){
		observers.add(t);
	}

	@Override
	public void setChange() {
		change = true;
	}

	@Override
	public String notifyObservers(Object o) {
		Operation operation = (Operation)o;
		String ret = "";
		if (change){
			for(Trader trader : observers){
				ret += trader.getNombre()+":The latest trade is Trader:"+operation.getTrader().getNombre()+" "+operation.getTipo_transaccion()+
						" $"+operation.getPrecio()+" Stock: "+operation.getStock().getTipo()+"\n";
				trader.update();
			}
			change = false;
			return ret.substring(0,ret.length()-1);
		}else
			return null;

	}
}