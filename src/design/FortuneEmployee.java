package design;


import java.util.*;


public class FortuneEmployee {


	private static Object ArrayList;

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 **/
	public static void main(String[] args) throws Exception {


		CompanyInfo companyInfo = new EmployeeInfo();
		companyInfo.Company();
		companyInfo.CompanyBirth();
		companyInfo.CompanyCEO();
		companyInfo.CompanyWorkers();




		EmployeeInfo e1 = new EmployeeInfo("Kevin", 101);
		EmployeeInfo e2 = new EmployeeInfo("Steph", 102);
		EmployeeInfo e3 = new EmployeeInfo("Kobe", 103);
		EmployeeInfo e4 = new EmployeeInfo("Lebron", 104);
		EmployeeInfo e5 = new EmployeeInfo("Klay", 105);




		String emp1Dep = e1.assignDepartment("Information Technology");
		String emp2Dep = e2.assignDepartment("Accounting");
		String emp3Dep = e3.assignDepartment("Finance");
		String emp4Dep = e4.assignDepartment("Customer Service");
		String emp5Dep = e5.assignDepartment("Sales");

		e1.setSalary(50000);
		e1.calculateSalary(e1.getSalary());
		e2.setSalary(30000);
		e2.calculateSalary(e1.getSalary());
		e3.setSalary(25000);
		e3.calculateSalary(e3.getSalary());
		e4.setSalary(70000);
		e4.calculateSalary(e4.getSalary());
		e5.setSalary(80000);
		e5.calculateSalary(e5.getSalary());



		e1.setPerformance(5);
		EmployeeInfo.calculateEmployeeBonus(e1.getSalary(), e1.getPerformance());

		e2.setPerformance(3);
		EmployeeInfo.calculateEmployeeBonus(e2.getSalary(), e2.getPerformance());

		e3.setPerformance(5);
		EmployeeInfo.calculateEmployeeBonus(e3.getSalary(), e3.getPerformance());

		e4.setPerformance(3);
		EmployeeInfo.calculateEmployeeBonus(e4.getSalary(), e4.getPerformance());

		e5.setPerformance(1);
		EmployeeInfo.calculateEmployeeBonus(e5.getSalary(), e5.getPerformance());

		EmployeeInfo.calculateEmployeePension(e1.getSalary());



		ArrayList<Object> emp1Record = new ArrayList<Object>();

		emp1Record.add(e1.getEmployeeId());
		emp1Record.add(e1.getEmployeeName());
		emp1Record.add(emp1Dep);
		emp1Record.add(e1.getSalary());
		emp1Record.add(EmployeeInfo.calculateEmployeeBonus(e1.getSalary(), e1.getPerformance()));


		ArrayList<Object> emp2Record = new ArrayList<Object>();
		emp2Record.add(e2.getEmployeeId());
		emp2Record.add(e2.getEmployeeName());
		emp2Record.add(emp2Dep);
		emp2Record.add(e2.getSalary());
		emp2Record.add(EmployeeInfo.calculateEmployeeBonus(e2.getSalary(), e2.getPerformance()));



		Map<Integer, ArrayList<Object>> employeeRecord = new HashMap<>();

		employeeRecord.put(1, emp1Record);
		employeeRecord.put(2, emp2Record);



		for (Map.Entry<Integer, ArrayList<Object>> data :
				employeeRecord.entrySet()) {

			System.out.println(data.getKey());
			System.out.println(data.getValue());
		}



	}


}
