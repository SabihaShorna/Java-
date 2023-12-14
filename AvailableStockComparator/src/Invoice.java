import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class Invoice {
	private ArrayList<Product> items;
	private LocalDateTime date;
	
	public Invoice() {
		items=new ArrayList<>();
		date=LocalDateTime.now();
	}
	
	public String getLocalTime() {
		return date.toString();
	}
	
	public void addProduct(Product product) {
		items.add(product);
	}
	
	public void removeProduct(Product product) {
		items.remove(product);
	}
	
	private double calculetPriceWithoutDiscount() {
		double s=0;
		for(Product p:items) {
			s=p.getPrice()+s;
		}
		return s;
	}
	
	private boolean isFullHouseDiscountAvailable() {
		int movie=0,music=0,game=0;
		for(Product p:items) {
			if(p.getClass().getName()=="default.Movie") {
				movie++;
			}
			if(p.getClass().getName()=="default.Music") {
				music++;
			}
			if(p.getClass().getName()=="default.Game") {
				game++;
			}
		}
		if(movie>=2&&music>=2&&game>=2) {
			return true;
		}
		return false;
	}
	
	public double calculateDiscountedPrice() {
		double s=0;
		double dp=0;
		for(Product p:items) {
			s=p.getDiscount()+s;
			dp=((p.getPrice()*p.getDiscount())/100)+dp;
		}
		if(isFullHouseDiscountAvailable()) {
			if(s>=50) {
				return dp;
			}else {
				return (calculetPriceWithoutDiscount()/2);
			}
		}
		return dp;
	}
	
	public String getInvoice() {
		double v=(calculetPriceWithoutDiscount()-calculateDiscountedPrice());
		String j="";
		System.out.print(date.toString()+"\n");
		for(Product p:items) {
			String a="Name: "+p.getName()+", "+"Price: "+p.getPrice()+"\n";
			j=j+a;
			if(p instanceof StockableProduct) {
				StockableProduct s=(StockableProduct)p;
				s.removeStock(1);
			}
			
		}
		
		return j+"\nTotal Price: "+calculetPriceWithoutDiscount()+"\nPrice after discount:"+v;
	}
	
	@Override
	public String toString() {
		String j="";
		for(Product p:items) {
			if(p instanceof StockableProduct) {
				StockableProduct s=(StockableProduct)p;
				if(p.getClass().getName()=="assignment_spring2020.Movie") {
					
					String a="Name: "+p.getName()+", Catagory: Movie "+",Items: "+s.getNumberOfStockItem()+"\n";
					j=j+a;
				}
				if(p.getClass().getName()=="assignment_spring2020.Music") {
					String a="Name: "+p.getName()+", Catagory: Music "+",Items: "+s.getNumberOfStockItem()+"\n";
					j=j+a;
				}
				if(p.getClass().getName()=="assignment_spring2020.Game") {
					String a="Name: "+p.getName()+", Catagory: Game,"+" Items: "+s.getNumberOfStockItem()+"\n";
					j=j+a;
				}
			
			}

		}
		return j;
	}

}

