package lab12;

	public class Circle extends Shape{

		private int circleId;
		private static int circleCounter;
		
		public Circle(double radious) {
		  
			super(radious,radious);
			circleCounter++;
			circleId = circleCounter;
			
		  }  
	 public double getRadious() {
		 
		 return getDimension1();
		 
	 }
		
		
		public void setRadious(double radious) {
			
			setDimension1 (radious) ;
		
			
		}
		
		
		public int getcircleId() {
			 
			 return circleId;
			 
		 }
		
		public static int getcircleCounter() {
			 
			 return circleCounter;
			 
		 }
		
		public String getName() {
			 
			 return "circle";
			 
		 }
		
		
		public double getArea() {
			 
			 return Math.PI*getRadious()*getRadious();
			 
		 }
		
		 public String toString() {
			  
			return "circle area["+getArea()+"]";
			
		  }
		
		
	}



