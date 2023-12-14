
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		    	Movable q1 = new MovablePoint(1, 2, 2, 4);     
		        System.out.println(q1);
		        q1.moveLeft();
		        System.out.println(q1);
		           
		        
		        
		        Movable q2 = new MovableCircle(4, 4, 5, 6, 8); 
		        System.out.println(q2);
		        q2.moveRight();
		        System.out.println(q2);
		    }
		
	}


