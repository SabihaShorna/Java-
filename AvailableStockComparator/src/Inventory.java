import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
public class Inventory implements Iterable<StockableProduct>{
private ArrayList<StockableProduct> item;
	
	public Inventory() {
		item=new ArrayList<>();
	}
	public void addItem(StockableProduct product) {
		item.add(product);
	}
	public void removeProductItem(int productId) {
		item.remove(productId);
	}
	public Product getItem(int productId) {
		return item.get(productId);
	}
	@Override
	public Iterator<StockableProduct> iterator(){
		return item.iterator();
	}
	public void sortByPrice() {
		Collections.sort(item,new PriceComparator());
	}
	public void sortByAvailableStock() {
		Collections.sort(item,new AvailableStockComparator());
	
	}
	

}
