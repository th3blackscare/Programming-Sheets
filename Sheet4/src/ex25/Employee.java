package ex25;

public class Employee extends person {
    protected double Salary;
    protected String Office;
    protected java.util.Date DateHired;
    public Employee(String Name){
        this(Name,0,"Null",new java.util.Date());
    }
    public Employee(String Name,double Salary,String Office,java.util.Date DateHired){
        super(Name);
        this.Salary=Salary;
        this.Office=Office;
        this.DateHired=DateHired;
    }
    public void setSalary(double Salary){
        this.Salary=Salary;
    }
    public double getSalary(){
        return Salary;
    }
    public java.util.Date DateHired(){
        return DateHired;
    }
    @Override
    public String toString(){
        return "Name: "+getName()+" Salary: "+getSalary();
    }
}
