package week1.day2.assignments;

public class EmployeeDetails {

	
	public static void main(String[] args) {
		
		EmployeeDetails obj = new EmployeeDetails();
		obj.printEmployeeName("Asha",2233434);
		obj.getEmployeeAddress("Chennai");
		System.out.println(obj.printEmployeeSalary(14500.00));
		obj.printEmployeeMobileNumber(984323343);
		
		
}
   public void printEmployeeName(String empName, int empId)
    {
	    
    	System.out.println("EmpName:" + " " + empName + "," + "EmpId:" + " " + empId);
    	
    }
	public String getEmployeeAddress(String empAddress)
	{ 
		System.out.println(empAddress);
		return empAddress;
		
	}
	public double printEmployeeSalary(double empSalary)
	{
		return empSalary;
	}
	public long printEmployeeMobileNumber(long mobNum)
	{
		System.out.println(mobNum);
		return mobNum;
	}
}
