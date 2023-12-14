
public class Music extends  StockableProduct {
private String artistName;
	
	public Music(String name,double price,int yearPublished,String genre,
			double discount,int  numberOfStockItem,String artistName) {
		super(name,price,yearPublished,genre,discount,numberOfStockItem);
		this.artistName=artistName;
	}
	
	public String getArtistName() {
		return artistName;
	}
	
	public void setArtistName(String artistName) {
		this.artistName=artistName;
	}
	@Override
	public String getInfo() {
		return "Name: "+getName()+", Catagory: Movie"+", Artist Name: "+artistName+", Available Items: "+
	getNumberOfStockItem()+", Price: "+getPrice()+"\n";
	}
	
	@Override
	public String toString() {
		return "Name: "+getName()+", Product Id: "+getProductId()+
				", Price: "+getPrice()+", Genre: "+getGenre()+
				", Year of Published: "+getYearPublished()+", Discount"+getDiscount()+
				", Artist: "+artistName+", AvailableItem: "+getNumberOfStockItem()+"\n";
	}
	

}
