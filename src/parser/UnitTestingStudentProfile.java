package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        Student student = new Student("Eastiaq", "Ahmed", "90", "10233");


        try{
            Assert.assertEquals(student.getFirstName(),"Eastiaq");
            System.out.println("Pass");
        }catch ( AssertionError as){
            System.out.println("Fail");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }


        try{
            Assert.assertEquals(student.getLastName(),"Ahmed");
            System.out.println("Pass");
        }catch (AssertionError as){
            System.out.println("Fail");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }


        try{
            Assert.assertEquals(student.getScore(),"90");
            System.out.println("Pass");
        }catch (AssertionError as){
            System.out.println("Fail");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }


        try{
            Assert.assertEquals(student.getId(),"10233");
            System.out.println("Pass");
        }catch (AssertionError as){
            System.out.println("Fail");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

    }
}
