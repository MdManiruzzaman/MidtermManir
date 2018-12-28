package design;

public interface Employee {
	
	/*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.
	
	//employeeId() will return employee id.
	public int empID();
	
	//employeeName() will return employee name
	public String empName();
	
	//assignDepartment() will assign employee to departments
    public void assignDepartmentName();
	
	//calculate employee salary
	public int calculateYearlySalary();
	
	//employee benefit
	public void benefitLayout();

	public default void startUpBonus(){
		System.out.println("Start up Bonus amount is $5000. Default method from Employee Interface");
	}

	public static void housing(){
		System.out.println("\nFree Housing for all Employee. Static void method from Employee Interface\n");
	}
}
