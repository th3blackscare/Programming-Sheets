package ex25;

import ex25.person;

public class Student extends person {
    public static final String Freshman="Freshman";
    public static final String Sophomore="Sophomore";
    public static final String Junior="Junior";
    public static final String Senior="senior";
    protected String Status;
    public Student(String name, String address,
                   String phone, String email, String status) {
        super(name, address, phone, email);
        this.Status = status;
    }
    @Override
    public String toString(){
        return "Student"+"\nName: "+getName()+"\nStatus: "+Status;
    }
}
