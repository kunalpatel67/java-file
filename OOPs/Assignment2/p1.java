/*1. Create a class Student that contains following data members
● static variable to create unique number
● A variable to store roll no
● A variable to store name
● An array to store marks of 5 subjects
● a field totalMarks

This class should have following member functions:

A constructor with no-parameters that increments static variable and assign it to roll
number. Remaining data members should be initialized to zero or empty values.

Input() function to input name and marks of 5 subjects from user

Show() function to display roll number, name and marks of 5 subjects to the user

TotalStudents() function that should display the number of objects that has been
created so far. This function should be static.

TotalMarks() function that should calculate and return to total marks of a student

getHighest() function that returns highest marks of the student

getLowest() function that returns lowest marks of the student

getAverage() function that returns average marks of student

getPassCount() function that counts and returns total number of subjects in which the
a student passed. (A student is passed if he gets 50% or above marks)

In the main function, create three objects, input their values and display them. For each
student, display his total marks, highest, lowest, average marks and the number of
subjects in which he is passed. Also display how many students have been registered so
far.*/

package OOPs.Assignment2;
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        s1.input();
        s2.input();
        s3.input();
//        s1.input("Kunal", new int[]{75,78,89,64,52});
//        s2.input("Parth", new int[]{45,78,90,34,56});
//        s3.input("Jenish", new int[]{78,89,90,45,54});
//        s1.show();
//        s1.totalMarks();
//        s1.getHighest();
//        s1.getLowest();
//        s1.getAvg();
//        s1.getPassCount();
//        student.totalStudent();

        student[] students = {s1,s2,s3};
        for (int i = 0; i < students.length; i++){
            students[i].show();
            students[i].totalMarks();
            students[i].getHighest();
            students[i].getLowest();
            students[i].getAvg();
            students[i].getPassCount();
            System.out.println();
        }
        student.totalStudent();
    }
}

class student{
    static int count = 0;
    int rNo;
    String name;
    int[] marks = new int[5];
    int totalMarks;

    student(){
        count++;
        rNo = count;
        name = "";
        totalMarks = 0;
        for (int i = 0; i < 5; i++){
            marks[i] = 0;
        }
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    //USER INPUT:
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name for student " + rNo + ": ");
        name = sc.nextLine();

        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
    }

//    public void input(String name, int[] marks){
//        this.name = name;
//        this.marks = marks;
//    }


    public void show(){
        System.out.println("Roll No: " + rNo);
        System.out.println("Name: " + name);
        System.out.print("Marks of " + name + " is" + ": ");
        for (int i = 0; i < 5; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }

    public static void totalStudent(){
        System.out.println("Total student registered: " + count);
    }

    public void totalMarks(){
        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum += marks[i];
        }
        this.totalMarks = sum;
        System.out.println("Total marks of " + name + " is" + ": " + sum);
    }

    public void getHighest(){
        int max = marks[0];
        for (int i = 1; i < 5; i++){
            if (marks[i] > max){
                max = marks[i];
            }
        }
        System.out.println("Highest Marks of " + name + " is" + ": " + max);
    }

    public void getLowest(){
        int min = marks[0];
        for (int i = 1; i < 5; i++){
            if (marks[i] < min){
                min = marks[i];
            }
        }
        System.out.println("Lowest Marks of " + name + " is" + ": " + min);
    }

    public void getAvg(){
        float sum = 0;
        for (int i = 0; i < 5; i++){
            sum += marks[i];
        }
        System.out.println("Average Marks of " + name + " is" + ": " + sum/5);
    }

    public void getPassCount(){
        int count = 0;
        for (int i = 0; i < 5; i++){
            if (marks[i] >= 50){
                count++;
            }
        }
        System.out.println(name + " Passed in " + count + " Subject");
    }
}
