package design;

public interface Employee {

    /*Employee is an Interface which contains multiple unimplemented methods.Again few methods
	has been declared in below. you need to brainstorm to add more methods to meet the business requirements.
	*/
	//please read the following method and understand the business requirements of these following methods
	//and then implement these in a concrete class.


	public int employeeId();

	public String employeeName();

	public char gender();

	public double age();

	public String jobTitle();

	public String dateOfJoin();

	public String socialSN();

	public void assignDepartment();

	public int calculateSalary(int salary);

}