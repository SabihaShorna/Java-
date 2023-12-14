package lab12;


	public class Rectangular extends Shape{


		private int rectangleId;
		private static int rectangleCounter;
		
		public Rectangular(double side1,double side2) {
		  
			super(side1,side2);
			rectangleCounter++;
			rectangleId = rectangleCounter;
			
		  }  
	 
		public double getSide1() { 
		 
		 return getDimension1();
		 
	    }
		

		public void setSide1(double side1) {
			
			setDimension1 (side1) ;
			
		}
		
		public double getSide2() {
			 
			 return getDimension2();
			 
		 }
			
			public void setSide2(double side2) {
				
				setDimension2 (side2);
			}
			
		
		public int getRectangleId() {
			 
			 return rectangleId;
			 
		 }
		
		public static int getrectangleCounter() {
			 
			 return rectangleCounter;
			 
		 }
		
		public String getName() {
			 
			 return "Rrectangular";
			 
		 }
		
		
		public double getArea() {
			 
			 return getSide1()*getSide2();
			 
		 }
		
		 public String toString() {
			  
			return "rectengular area["+getArea()+"]";
		  }
		
		
		
		
	}


