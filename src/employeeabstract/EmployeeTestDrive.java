
/**
 * Write a description of class EmployeeTestDrive here.
 * 
 * @author (Ed Manion) 
 * @version (09/01/14)
 */

public class EmployeeTestDrive
{
  public static void main(String args[])
  {
    //test concrete examples
    //cannot instantiate an Employee object since it is abstract
    /*
    Employee joe = new Employee();
    joe.setAge(45);
    System.out.println("joe " + joe.toString());
    */
   
   
    SalariedEmployee sally = new SalariedEmployee();
    sally.setAge(36);
    sally.setAnnualRate(50000);
    sally.setStartTime(800);
    sally.setEndTime(1600);
    System.out.println("sally " + sally.toString());
    
    HourlyEmployee bill = new HourlyEmployee();
    bill.setAge(23);
    bill.setHourlyRate(22);
    bill.setStartTime(600);
    bill.setEndTime(1700);
    System.out.println("bill " + bill.toString());
    
  }
}
