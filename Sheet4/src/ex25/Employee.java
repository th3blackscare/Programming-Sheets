package ex25;

public class Employee extends person {
    protected String Salary;
    protected String Office;
    protected String DateHired;
    public Employee(String Name){
        this(Name,"0","Null","Null");
    }
    public Employee(String Name,String Salary,String Office,String DateHired){
        super(Name,Salary,Office,DateHired);
        this.Salary=Salary;
        this.Office=Office;
        this.DateHired=DateHired;
    }
    public void setSalary(String Salary){
        this.Salary=Salary;
    }
    public String getSalary(){
        return Salary;
    }
    public String DateHired(){
        return DateHired;
    }
    @Override
    public String toString(){
        return "Employee"+"\nName: "+getName()+" \nSalary: "+getSalary()+" Office: "+Office;
    }
}
