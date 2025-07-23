package OOPs.Inheritance;

public class hybrid_inheritence {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.name = "Dr. Sharma";
        prof.age = 45;
        prof.eId = 101;
        prof.salary = 90000;
        prof.subjects = new String[]{"Math", "Physics"};


        Student stu = new Student();
        stu.name = "Kunal";
        stu.age = 20;
        stu.rNo = 202305;
        stu.sem = 5;


        System.out.println("Professor Details:");
        System.out.println("Name: " + prof.name);
        System.out.println("Age: " + prof.age);
        System.out.println("Employee ID: " + prof.eId);
        System.out.println("Salary: " + prof.salary);

        System.out.println();
        System.out.println();

        System.out.println("Student Details:");
        System.out.println("Name: " + stu.name);
        System.out.println("Age: " + stu.age);
        System.out.println("Roll No: " + stu.rNo);
        System.out.println("Semester: " + stu.sem);
    }
}

class Person{
    String name;
    int age;
}
class Employee extends Person{
    int eId;
    int salary;
}
class Professor extends Employee{
    String[] subjects;
}
class Student extends Person{
    int rNo;
    int sem;
}