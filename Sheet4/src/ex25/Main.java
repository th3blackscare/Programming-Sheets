package ex25;

public class Main {
    public static void main(String[] args){
        person a = new person("John", "12 Bell street",
                "3473339999", "john12@aol.com");
        Student b = new Student("Mary", "100 Town Ave", "5149993333",
                "mary100@aol.com", Student.Freshman);
        Employee c = new Employee("Mike", "1500", "Chicago","24/12/2018"
                );
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

    }

}
