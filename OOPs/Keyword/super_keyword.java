package OOPs;

public class super_keyword {
    public static void main(String[] args) {
        clgstudent c1 = new clgstudent(1,500,"kunal",20,896574);
        System.out.println();
    }
}

class persons{
    private String name;
    private int age;
    private int contact;

    public persons(String name, int age, int contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public void printHello(){
        System.out.println("hello person");
    }
}

class clgstudent extends persons{
    private int eno;
    private int totalMarks;

    public clgstudent(int eno, int totalMarks, String name, int age, int contact) {
        super(name,age,contact); // calling parent class constructor using SUPER keyword
        this.eno = eno;
        this.totalMarks = totalMarks;
        super.printHello(); // we can call without super keyword then compiler called child class function when function name is same of both parent and child.
    }

    public void printHello(){
        System.out.println("hello student");
    }
}
