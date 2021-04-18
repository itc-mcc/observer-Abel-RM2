package wsStockMarket;

import java.util.ArrayList;

public class Trader implements Observer {
	private final String nombre;
	private final ArrayList<Operation> operaciones = new ArrayList<>();

	public Trader(String nombre, StockMarket mercado_acciones) {
		this.nombre = nombre;
	}

	public ArrayList<Operation> getOperaciones() {
		return operaciones;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public void update(Object o) {
		Operation operation = (Operation)o;

		//agregar la operacion al historial en el caso de tratarse del trader que realizó la operacion
		if (operation.getTrader() == this)
			operaciones.add(operation);

		//acciones a realizar al ser notificado y no ser quien realizó la operacion
		//  -  -  -  -  -
		//  -  -  -  -  -
	}
}