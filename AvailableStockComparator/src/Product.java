
public abstract class Product{
	private String name;
	private static int productId;
	private double price;
	private String genre;
	private int yearPublished;
	private double discount;
	
	
	public Product(String name,double price,int yearPublished,String genre,double discount) {
		this.productId=0;
		this.name=name;
		this.price=price;
		this.genre=genre;
		this.yearPublished=yearPublished;
		this.discount=discount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public static int getProductId() {
		return productId++;
	}
	public void setProductId(int productId) {
		this.productId=productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre=genre;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount=discount;
	}
	public abstract String getInfo();
	@Override
	public String toString() {
		return "Name: "+name+"\nProduct Id: "+getProductId()+
				"\nPrice: "+price+"\nGenre: "+genre+
				"\nYear of Published: "+yearPublished+"\nDiscount"+discount;
	}
}


