package ex25;

import ex25.person;

public class Student extends person {
    public static final String Freshman="Freshman";
    public static final String Sophomore="Sophomore";
    public static final String Junior="Junior";
    public static final String Senior="senior";
    protected String Status;
    public Student(String Name){
        super(Name);
    }
    public Student(String Name,String Status){
        super(Name);
        this.Status=Status;
    }
    @Override
    public String toString(){
        return "Name"+getName();
    }
}
