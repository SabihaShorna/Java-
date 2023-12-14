package Assignmnt1;

import java.util.Comparator;
public class AvailableStockComparator implements Comparator<StockableProduct>{

	@Override
	public int compare(StockableProduct o1, StockableProduct o2) {
		// TODO Auto-generated method stub
	if (o1.getNumberOfItemsStocked()>o2.getNumberOfItemsStocked()) {
		return 1;
	}
	else if (o1.getNumberOfItemsStocked()<o2.getNumberOfItemsStocked()) {
		return -1;
	}
	else {
		return 0;
	}
}
}

