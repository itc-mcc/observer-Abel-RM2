package wsStockMarket;

public class Trader implements Observer {
	private final String nombre;
	private final StockMarket mercado_acciones;

	public Trader(String nombre, StockMarket mercado_acciones) {
		this.nombre = nombre;
		this.mercado_acciones = mercado_acciones;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public void update() {

	}
}