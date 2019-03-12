package design;

import java.util.Scanner;


public class EmployeeInfo extends CompanyInfo implements Employee {

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
	private int employeeId;
	private String employeeName;
	private String departmentName;
	private int socialSN;
	private static int numberOfYearsWithCompany;
	private int salary;
	private String dateOfJoin;
	private double age;
	private String  jobTitle;
	private int annualLeave;
	private String performance;
	private char gender;





	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 *
	 *
	 */



	public EmployeeInfo(String employeeName, int employeeId){

		this.employeeName = employeeName;
		this.employeeId = employeeId;

		System.out.println(this.employeeName + " "+ this.employeeId);

	}
	public EmployeeInfo(int employeeId, int salary){

		this.employeeId = employeeId;
		this.salary = salary;


	}

	public EmployeeInfo(String jobTitle, double age ){

		this.jobTitle = jobTitle;
		this.age = age;

		System.out.println(this.jobTitle + " " + this.age);
	}

	public EmployeeInfo(int socialSN, char gender){

		this.socialSN = socialSN;
		this.gender = gender;


	}

	public EmployeeInfo(int numberOfYearsWithCompany){


		this.numberOfYearsWithCompany = numberOfYearsWithCompany;


	}

	public EmployeeInfo() {

	}


	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */


	public String setPerformance (int score){

		if (score == 5)
			performance = "Best performance";

		if (score == 3)
			performance = "Average performance";

		if (score == 1)
			performance = "Poor performance";

		return performance;
	}

	public String getPerformance (){

		return this.performance;


	}

	public static int calculateEmployeeBonus(int salary, String performance) {
		int total = 0;


		if (performance.equals("Best performance")) {
			total = (int) (salary * 0.1);
		} else if (performance.equals("Average performance")) {
			total = (int) (salary * 0.08);
		}
			else if (performance.equals("Poor performance")) {
				total = (int) (salary * 0);
		}
		System.out.println("Total yearly bonus: $" + total);
		return total;

	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 *
	 */
	public static int calculateEmployeePension(int salary) {
			int total = 0;

			Scanner sc  = new Scanner(System.in);
			System.out.println("Please enter start date in format (example: May,2015): ");
			String joiningDate = sc.nextLine();
			System.out.println("Please enter today's date in format (example: August,2017): ");
			String todaysDate = sc.nextLine();
			String convertedJoiningDate = DateConversion.convertDate(joiningDate);
			String convertedTodaysDate = DateConversion.convertDate(todaysDate);
		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
		String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4, convertedTodaysDate.length());

			int start = Integer.parseInt(startYear);
			int current = Integer.parseInt(currentYear);

			numberOfYearsWithCompany = (current - start);



		total = (int) (numberOfYearsWithCompany * 0.05 * salary);

		System.out.println("Total yearly pension: $"  + total);

		return total;


	}

	@Override
	public int employeeId() {
		return employeeId;
	}

	@Override
	public String employeeName() {
		return employeeName;
	}

	@Override
	public double age() {
		return age;
	}

	@Override
	public char gender() {
		return gender;
	}

	@Override
	public String jobTitle() {
		return jobTitle;
	}

	@Override
	public String dateOfJoin() {
		return dateOfJoin;
	}


	@Override
	public String socialSN() {
		return null;
	}

	@Override
	public void assignDepartment() {

	}


	public String assignDepartment(String departmentName) {

		System.out.println(departmentName);

		return departmentName;
	}

	@Override
	public int calculateSalary(int salary) {

		return this.salary;
	}




	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSocialSN() {
		return socialSN;
	}

	public void setSocialSN(int socialSN) {
		this.socialSN = socialSN;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public static int getNumberOfYearsWithCompany() {
		return numberOfYearsWithCompany;
	}

	public static void setNumberOfYearsWithCompany(int numberOfYearsWithCompany) {

		EmployeeInfo.numberOfYearsWithCompany = numberOfYearsWithCompany;
	}


	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualLeave() {
		return annualLeave;
	}

	public void setAnnualLeave(int annualLeave) {
		this.annualLeave = annualLeave;
	}

	public String getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}





	private static class DateConversion {

		public DateConversion(Months months) {
		}

		public static String convertDate(String date) {
			String[] extractMonth = date.split(",");
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
					date = 7;
					break;
				case August:
					date = 8;
					break;
				case September:
					date = 9;
					break;
				case October:
					date = 10;
					break;
				case November:
					date = 11;
					break;
				case December:
					date = 12;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}