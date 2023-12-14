
import java.util.Comparator;
public class PriceComparator implements Comparator< StockableProduct> {
	@Override
	public int compare( StockableProduct o1, StockableProduct o2) {
		if(o1.getPrice()<o2.getPrice()) {
			return -1;
		}
		if(o1.getPrice()>o2.getPrice()) {
			return 1;
		}
		return 0;
		
	}
	}


