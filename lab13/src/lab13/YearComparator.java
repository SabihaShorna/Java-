package lab13;


import java.util.Comparator;
public class YearComparator implements Comparator<Employee>{
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
}