package design;

import java.util.Scanner;

public class EmployeeInfo extends WeEmployee implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	private int empID;
	private String empName;
	private String departmentName;
	private double salary;
	private int performance;

	public EmployeeInfo(){                  // Default Constructor

	}
	public EmployeeInfo(int empID, String empName, String departmentName){
		this.empID = empID;
		this.empName = empName;
		this.departmentName = departmentName;
		System.out.println("This is from parametarized constructor of EmployeeInfo");

	}
	public EmployeeInfo(int empID, String empName, String departmentName, int performance){
		this.empID = empID;
		this.empName = empName;
		this.departmentName = departmentName;
		this.performance = performance;
	}

/*	public static String getCompanyName() {
		return companyName;
	}

	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}
*/
	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	@Override
	public void empProfile() {
		System.out.println("PSC's Vission and Mission: \n"+vission+"\n"+mission);

	}

	@Override
	public int empID() {
		return 0;
	}

	@Override
	public String empName() {
		return null;
	}

	@Override
	public void assignDepartmentName() {

	}

	@Override
	public int calculateYearlySalary() {
		int yearlySalary = (int) (12*salary);
		return yearlySalary;
	}

	@Override
	public void benefitLayout() {
		System.out.println("The highest training institute of Police");
	}
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany){  // Polymorphism
		int total=0;
		return total;
	}

	public static double calculateEmployeeBonus(double salary, int performance){
		double yearlyBonus = 0;
		if (performance == 5) {
			yearlyBonus = salary * 0.1;
		}else if (performance == 4) {
			yearlyBonus = salary * 0.08;
		}else if (performance == 3) {
			yearlyBonus = salary * 0.06;
		}else if (performance == 2) {
			yearlyBonus = 0;
			System.out.println("Improve Your Performance");
		}else if (performance == 1) {
			yearlyBonus = 0;
			System.out.println("Bye, See You some other time, Take care");
		}
		return yearlyBonus;
	}
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public int calculateEmployeePension(){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
        String startYear = convertedJoiningDate.substring(convertedJoiningDate.length()-4, convertedJoiningDate.length());
        String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length()-4, convertedTodaysDate.length());

        int start = Integer.parseInt(startYear);
        int current = Integer.parseInt(currentYear);

        //implement numbers of year from above two dates
		//Calculate pension
		int numberOfYears = current - start;

		if (numberOfYears >= 5) {
			total = (int) (salary * .25);
		}
		else if (numberOfYears == 4) {
			total = (int) (salary * .20);
		}
		else if (numberOfYears == 3) {
			total = (int) (salary * .15);
		}
		else if (numberOfYears == 2) {
			total = (int) (salary * .10);
		}
		else if (numberOfYears == 1) {
			total = (int) (salary * .05);
		}
		else if (numberOfYears == 0) {
			total = 0;
		}
		System.out.println("Total pension: $" +total +"\n");

		return total;
	}

	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
