/*1. Write a program which creates a class p1student with the following Data Members
rollNum, studName, mark1, mark2, mark3, totalMarks.

Methods:-
setStudDetails() – which sets the values to all the data members except totalMarks.
calculateTotal() - which calculate the totalMarks
displayStudDetails() – which displays rollNum, studName and totalMarks
Create a class p1studentDemo to test the functionality of p1student class */

package OOPs.Assignment1;

public class p1 {
    public static void main(String[] args) {
        p1student s1 = new p1student();
        s1.setStudDetails(1,"kunal",78,84,89);
        s1.calculateTotal();
        s1.displayStudDetails();

        p1student s2 = new p1student();
        s2.setStudDetails(2,"rahul",70,70,70);
        s2.calculateTotal();
        s2.displayStudDetails();

        p1student s3 = new p1student();
        s3.setStudDetails(3,"hitesh",85,81,89);
        s3.calculateTotal();
        s3.displayStudDetails();
    }
}

class p1student{
    int rollnum;
    String studName;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;

    public void setStudDetails(int rollnum, String studName, int mark1, int mark2, int mark3){
        this.rollnum = rollnum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void calculateTotal(){
        totalMarks = mark1+mark2+mark3;
    }

    public void displayStudDetails(){
        System.out.println("Roll No: " + rollnum);
        System.out.println("Name: " + studName);
        System.out.println("TotalMarks: " + totalMarks);
        System.out.println();
    }
}
