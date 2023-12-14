package lab13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class EmployeeDatabase implements Iterable<Employee>{
private ArrayList<Employee> employeeList;
	
	public EmployeeDatabase() {
		employeeList = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	@Override
	public Iterator<Employee> iterator() {
		return employeeList.iterator();
	}
	
	public void sortByID() {
		Collections.sort(employeeList, new IDComparator());
	}
	public void sortBySalary() {
		Collections.sort(employeeList, new SalaryComparator());
	}
	public void sortByYear() {
		Collections.sort(employeeList, Employee.yearComparator);
	}
}