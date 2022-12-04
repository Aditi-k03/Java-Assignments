import java.util.*;
class EmployeeWageComputation
{
    char COMPANY_NAME;
    int WAGE_PER_HR;
    int MAX_WORKING_DAYS;
    int MAX_WORKING_HRS;
    int totalEmpWage;

    EmployeeWageComputation(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        COMPANY_NAME = companyName;
        WAGE_PER_HR = wagePerHr;
        MAX_WORKING_DAYS = maxWorkingDays;
        MAX_WORKING_HRS = maxWorkingHrs;
        totalEmpWage = 0;
    }


    public String toString()
    {
        System.out.println("Details of " + COMPANY_NAME + " employee");
        System.out.println("-----------------------------------------------------");
        System.err.println("Wage per hour:" + WAGE_PER_HR);
        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
        return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalEmpWage + "\n";
    }

    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        EmployeeWageComputation company = new EmployeeWageComputation(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
        companies.add(company);
    }


    public static void main(String args[])
    {
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
        employeeWageComputation.addCompany("TCS", 4, 30, 100);
        employeeWageComputation.addCompany("Infosys", 5, 40, 170);
        employeeWageComputation.addCompany("Capgemini", 19, 10, 150);
        
    }
}