
/**
 * Abstract class Employee - write a description of the class here
 * 
 * @author (Ed Manion)
 * @version (09/01/14)
 */
public abstract class Employee
{
    // instance variables - replace the example below with your own
    private int age;

    /**
     * Constructor for objects of class Employee
     */
    public Employee()
    {
        // initialise instance variables
        age = 0;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        // input validation goies here
        this.age = age;
    }
    
    /**
     * Start Time and End Time
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    public abstract int getStartTime();
    
    public abstract void setStartTime(int startTime);
    
    public abstract int getEndTime();
    
    public abstract void setEndTime(int endTime);
    
    
    public String toString()
    {
        String x = "\nEmployee age = " + age;
        return x;
    }

}
