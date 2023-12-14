
public class StockableProduct extends Product implements Stockable {
private int numberOfStockItem;
	
	public StockableProduct(String name,double price,int yearPublished,String genre,
			double discount,int numberOfStockItem) {
		
		super(name,price,yearPublished,genre,discount);
		this.numberOfStockItem= numberOfStockItem;
	}
	
	@Override
	public void addStock(int num) {
		 numberOfStockItem= numberOfStockItem+num;
	}
	
	@Override
	public void removeStock(int num) {
		 numberOfStockItem=numberOfStockItem-num;
	}
	
	@Override
	public void editStock(int num) {
		 numberOfStockItem=num;
	}
	
	public int getNumberOfStockItem() {
		return  numberOfStockItem;
	}
	
	public  void setNumberOfStockItem(int numberOfStockItem) {
		this.numberOfStockItem= numberOfStockItem;
	}
	
	
	@Override
	public String getInfo() {
		return "Name: "+getName()+","+"Available items :"+numberOfStockItem+"\n";
	}
	
	@Override
	public String toString() {
		return "Number of Stock Item is:"+numberOfStockItem;
	}
}
