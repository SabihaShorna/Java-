import java.util.Scanner;
public class Ship {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 int t= scan.nextInt();
		 while(t-->0){
        char  ch= scan.next().charAt(0); 
			if(ch=='b'||ch== 'B'){
				System.out.println("BattleShip");
			}
			if(ch=='c'||ch=='C'){
			    System.out.println("Cruiser");
			}
			   
			if(ch== 'd'||ch== 'D') {
				System.out.println("Destroyer");
			}
		  if(ch=='f'|| ch=='F') {
	
			    System.out.println("Frigate");    
		        }
	}

}
}
