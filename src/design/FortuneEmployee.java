package design;

import java.util.ArrayList;
import java.util.List;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		EmployeeInfo empInfo = new EmployeeInfo();
		empInfo.collegeestablished();
		empInfo.empProfile();
		Employee.housing();

		EmployeeInfo pscTeamLead = new EmployeeInfo(2345765, "Rowshan Ara", "Rector");
		pscTeamLead.setSalary(9000.0);
		pscTeamLead.calculateEmployeePension();
		pscTeamLead.startUpBonus();


		EmployeeInfo emp1 = new EmployeeInfo();
		emp1.getDepartmentName();
		emp1.setDepartmentName("Accounts");
		emp1.getSalary();
		emp1.setSalary(7200.0);
		emp1.getPerformance();
		emp1.setPerformance(5);


		EmployeeInfo emp2 = new EmployeeInfo(567, "Fatemi", "Vice-Rector", 3);
		emp2.getDepartmentName();
		emp2.getSalary();
		emp2.setSalary(6000.0);
		emp2.getPerformance();
		emp2.calculateEmployeePension();
		//emp1.calculateEmployeePension();
		//System.out.println("His pension is: "+emp1.calculateEmployeePension());

		EmployeeInfo emp3 = new EmployeeInfo(5637, "Rasul", "MDS-Research", 4);
		emp3.getDepartmentName();
		emp3.getSalary();
		emp3.setSalary(5500.0);
		emp3.getPerformance();
		emp3.calculateEmployeePension();



	}

}
