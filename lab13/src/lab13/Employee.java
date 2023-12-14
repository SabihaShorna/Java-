package lab13;

import java.util.Comparator;
public class Employee {
	private String name;
	private int id;
	private double salary;
	private int yearOfJoining;
	
	public Employee(String name, int id, double salary, int yearOfJoining) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.yearOfJoining = yearOfJoining;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	@Override
	public String toString() {
		return "Name = " + name + ", Id = " + id + ", Salary = " + salary + ", Year Of Joining=" + yearOfJoining;
	}
	
	public static Comparator<Employee> yearComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			if(o1.getYearOfJoining() < o2.getYearOfJoining()) {
				return -1;
			}
			else if (o1.getYearOfJoining() > o2.getYearOfJoining()) {
				return 1;
			}
			else {
				return 0;
			}
		}
	};
}

