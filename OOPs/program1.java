package OOPs;

public class program1 {
    public static void main(String[] args) {
        student s1 = new student(1,"kunal"); // calling parameterised constructor
        s1.setperc(80); // calling setter method
        student s2 = new student(); // calling default constructor
        s2.setDetails(2,"hitesh",90); // calling all details at once
        System.out.println(s1.getR_no()); // calling getter method
        student s3 = new student(s1); // calling copy constructor
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}

class student{
    private int r_no;
    private String name;
    private int perc;

    student(){} // default constructor

    student (int r_no, String name){ // parameterised constructor
        this.r_no = r_no;
        this.name = name;
    }

    student(student old){ // copy constructor
        r_no = old.r_no;
        name = old.name;
        perc = old.perc;
    }

    public void setperc(int p){ // setter method
        perc = p;
    }

    public int getR_no(){ // getter method
        return r_no;
    }

    public void setDetails(int r_no, String name, int perc){
        this.r_no = r_no; // this keyword define class variable(global variable) when variable name is same
        this.name = name;
        this.perc = perc;
    }

    public void printDetails(){  // print all detail
        System.out.println(r_no + " " + name + " " + perc);
    }
}
