package lab13;

		import java.util.ArrayList;
		import java.util.Iterator;
		public class Test {

			public static void main(String[] args) {
				
		    EmployeeDatabase empDatabase = new EmployeeDatabase();
				
				Employee emp1 = new Employee("Asif", 132, 25000, 2013);
				Employee emp2 = new Employee("Hasin", 141, 15000, 2014);
				Employee emp3 = new Employee("Rasel", 121, 20000, 2012);
				Employee emp4 = new Employee("Fahim", 163, 10000, 2016);
				Employee emp5 = new Employee("Kaisar", 152, 12000, 2015);
				
				empDatabase.addEmployee(emp1);
				empDatabase.addEmployee(emp2);
				empDatabase.addEmployee(emp3);
				empDatabase.addEmployee(emp4);
				empDatabase.addEmployee(emp5);
				
				System.out.println("Employee List:");
				for(Employee emp : empDatabase) {
					System.out.println(emp);
				}
				System.out.println();
				
				System.out.println("Sort By ID:");
				empDatabase.sortByID();
				for(Employee emp : empDatabase) {
					System.out.println(emp);
				}
				System.out.println();
				
				System.out.println("Sort By Salary:");
				empDatabase.sortBySalary();
				for(Employee emp : empDatabase) {
					System.out.println(emp);
				}
				System.out.println();
				
				System.out.println("Sort By Year Of Joining:");
				empDatabase.sortByYear();
				for(Employee emp : empDatabase) {
					System.out.println(emp);
				}
				System.out.println();
			}

			


	}


