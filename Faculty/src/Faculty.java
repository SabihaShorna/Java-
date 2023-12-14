
public class Faculty extends Employee implements TaxCalculator {
	private String initial;
	private int monthlySalary;
	private int yearlyBonus;
	public Faculty (int id,String name,int age,String initial ,int mothlySalary,int yearlyBonus) {
		super(yearlyBonus, initial, yearlyBonus);
		this.initial=initial;
		this.monthlySalary=monthlySalary;
		this.yearlyBonus=yearlyBonus;
		
	}

	public Faculty(int id, String name, int age) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
	}
	public int yearlySalary() {
		return monthlySalary*12;
	
	}
	public int yearlyIncome(int yearlySalary) {
		return yearlySalary +yearlyBonus;
	}
	@Override
	public double yearlyIncomeTax() {
		 yearlyIncome=yearlyIncome*TAX_PERCENT/100;
	}
	
	
	

}
