package design;

public abstract class CompanyInfo {


    private final Object companyName = "Bank of Los Angeles";
    private final Object birth = "1998";
    private final Object CEO = "Adam Silver";
    private final Object companyWorkers = "3200";



    public void Company() {
        System.out.println("Company: " + companyName);

    }


    public void CompanyBirth() {
        System.out.println("Year Started: " + birth);

    }

    public void CompanyCEO() {
        System.out.println("CEO of the company is: " + CEO);
    }

    public void CompanyWorkers() {

        System.out.println("Number of Employees in the Company: " + companyWorkers);
    }

}