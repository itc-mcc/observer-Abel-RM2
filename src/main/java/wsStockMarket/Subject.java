package wsStockMarket;

public interface Subject {

    public void setChange();

    public String notifyObservers(Object o);

}
