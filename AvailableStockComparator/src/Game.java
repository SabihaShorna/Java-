
public class Game extends  StockableProduct {

	private String developer;
	
	public  Game(String name,double price,int yearPublished,String genre,double discount,int  numberOfStockItem,String developer) {
		super(name,price,yearPublished,genre,discount, numberOfStockItem);
		this.developer=developer;
	}
	
	public String getDeveloper() {
		return developer;
	}
	
	public void setDeveloper(String developer) {
		this.developer=developer;
	}
	
	@Override
	public String getInfo() {
		return "Name: "+getName()+", Catagory: Movie"+",  Developer: "+developer+", Available Items: "+
	getNumberOfStockItem()+", Price: "+getPrice()+"\n";
	}
	
	@Override
	public String toString() {
		return "Name: "+getName()+", Product Id: "+getProductId()+
				", Price: "+getPrice()+", Genre: "+getGenre()+
				", Year of Published: "+getYearPublished()+", Discount"+getDiscount()+
				", Developer: "+developer+", AvailableItem: "+getNumberOfStockItem()+"\n";
}


}
