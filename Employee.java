/** Create an Employee class that extends the
 *  Person class.  An employee has a jobTitle,
 *  and a salary.
 */

public class Employee extends Person {
    private String jobTitle;
    private int salary;

    public Employee(String name, int age, String jobTitle, int salary){
        super(name, age);           //Person(String, int)
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String jobTitle, int salary){
        super();
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(){
        super();
        this.jobTitle = "Unemployed";
        this.salary = 0;
    }
}