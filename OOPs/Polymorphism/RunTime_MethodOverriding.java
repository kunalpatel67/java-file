package OOPs.Polymorphism;

import java.util.Scanner;

public class RunTime_MethodOverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        bank b = null;
        if (choice == 1){
            b = new sbi();
        }
        else {
            b = new hdfc();
        }
        b.printInterestRate();
    }
}

class bank{
    public void printInterestRate(){
        System.out.println(4);
    }
}

class sbi extends bank{

}

class hdfc extends bank{
    // Overriding by changing body
    public void printInterestRate(){
        System.out.println(5);
    }
}