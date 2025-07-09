/*4. Create a class Student with attributes rollNo, Name, marks1, marks2,
marks3, totalMarks.
create a method getTop3Student() which accepts a list of Students and returns an
array of 3 top students with the highest percentage.*/

package OOPs.Assignment1;

public class p4 {
    public static void main(String[] args) {
        p4student[] students = new p4student[5];
        p4student s1 = new p4student(1,"Kunal",80,80,80);
        students[0] = s1;
        students[1] = new p4student(2,"rahul",70,70,70);
        students[2] = new p4student(3,"hitesh",90,90,90);
        students[3] = new p4student(4,"parth",60,60,60);
        students[4] = new p4student(5,"jatin",85,85,85);

        p4student[] top3 = s1.getTop3(students);
        top3[0].displayStudDetails();
        top3[1].displayStudDetails();
        top3[2].displayStudDetails();
    }
}

class p4student{
    int rollnum;
    String studName;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;

    public p4student(int rollnum, String studName, int mark1, int mark2, int mark3) {
        this.rollnum = rollnum;
        this.studName = studName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.totalMarks = mark1+mark2+mark3;
    }

    public void displayStudDetails(){
        System.out.println("Roll No: " + rollnum);
        System.out.println("Name: " + studName);
        System.out.println("TotalMarks: " + totalMarks);
        System.out.println();
    }

    public p4student[] getTop3(p4student[] students){
        for (int i = 0; i < students.length-1; i++){
            for (int j = 0; j < students.length-1-i; j++){
                if (students[j].totalMarks < students[j+1].totalMarks){
                    p4student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }

        p4student[] top3 = new p4student[3];
        top3[0] = students[0];
        top3[1] = students[1];
        top3[2] = students[2];
        return top3;
    }
}

//With O(n)
/*
public p4student[] getTop3(p4student[] students){

        int first = -1, second = -1, third = -1;

        for (int i = 0; i < students.length; i++) {
            if (first == -1 || students[i].totalMarks > students[first].totalMarks) {
                third = second;
                second = first;
                first = i;
            } else if ((second == -1 || students[i].totalMarks > students[second].totalMarks) && i != first) {
                third = second;
                second = i;
            } else if ((third == -1 || students[i].totalMarks > students[third].totalMarks) && i != first && i != second) {
                third = i;
            }
        }

        p4student[] top3 = new p4student[3];
        top3[0] = students[first];
        top3[1] = students[second];
        top3[2] = students[third];
        return top3;
    }
*/