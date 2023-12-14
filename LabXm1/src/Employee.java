
	public abstract class Employee{

	    private int SSN;
	    public int  PartTime=2;
	    public int  FullTime=1;
	    public int salary;

	    public int getSSN(){
	        return SSN;
	    }
	    public void setSSN(int SSN){
	        this.SSN=SSN;
	    }
	    private void printSSN(){
	        System.out.println(SSN);
	    }
	    int getNumberofEmployees(){
	        return SSN;
	    }
	    abstract void setSalary(int jobtype);
	    boolean iscompareEmployees(int SSN,int PartTime,int FullTime) {
	    	if(FullTime==PartTime) {
	    	return true;
	    }
			return false;}
}
