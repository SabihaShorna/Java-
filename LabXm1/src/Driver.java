
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a = new Employee() {
		
            @Override
            void setSalary(int jobtype) {
                if (jobtype==FullTime){
                    salary=40000;
                }
	        }
		}
	
;}
}


