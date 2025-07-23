package OOPs;

public class static_keyword {
    public static void main(String[] args) {
        student2 s1 = new student2(1,"A",20);
        student2 s2 = new student2(2,"B",18);
        student2.printGoodMorning(); // call static method using class name
        s1.printDetails();
        s2.printDetails();
    }
}

class student2{
    int rNo;
    String name;
    int age;
    static String schoolAddress; // Static variable

    public student2(int rNo, String name, int age) {
        this.rNo = rNo;
        this.name = name;
        this.age = age;
    }

    public void printDetails(){
        System.out.println("Roll No: " + rNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("SchoolAddress: " + schoolAddress);
        System.out.println();
    }

    static { // Static block to intialise static variable
        schoolAddress = "Surat";
    }

    public static void printGoodMorning(){
        System.out.println("Good Morning " + schoolAddress);
//        printGA();// you can't call non-static method in static method
    }

    public void printGA(){
        System.out.println(name + " Good Afternoon " + schoolAddress);
//        printGoodMorning(); // you can call static method in non-static method
    }
}
