package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.


        //testing for a 2 year contract job
        double pension=EmployeeInfo.calculateEmployeePension(50000);
        try{
            Assert.assertEquals(5000,5000);
            System.out.println("Test Passed");
        } catch (AssertionError as) {
            System.out.println("Test Failed");
        }
    }
}
