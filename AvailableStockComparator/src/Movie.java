
public class Movie extends StockableProduct {
private String director;
	
	public Movie(String name,double price,int yearPublished,String genre,double discount,int  numberOfStockItem,String director) {
		super(name,price,yearPublished,genre,discount,numberOfStockItem);
		
		this.director=director;
	}
	
	public String getDirector() {
		return director;
	}
	
	public void setDirector(String director) {
		this.director=director;
	}
	@Override
	public String getInfo() {
		return  "Name: "+getName()+", Catagory: Movie"+", Director: "+director+", Available Items: "+
				getNumberOfStockItem()+", Price: "+getPrice()+"\n";
				
	}
	
	@Override
	public String toString() {
		return "Name: "+getName()+", Product Id: "+getProductId()+
				", Price: "+getPrice()+", Genre: "+getGenre()+
				", Year of Published: "+getYearPublished()+", Discount"+getDiscount()+
				", Director: "+director+", AvailableItem: "+getNumberOfStockItem()+"\n";
	}
	

}
