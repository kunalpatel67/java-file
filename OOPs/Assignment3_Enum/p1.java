package OOPs.Assignment3_Enum;

public class p1 {
    public static void main(String[] args) {
        Emp e1 = new Emp(101,"kunal",50000,jobtitle.principal);
        Emp e2 = new Emp(102,"anmol",20000,jobtitle.professor);
        Emp e3 = new Emp(103,"hits",30000,jobtitle.hod);
        Emp e4 = new Emp(104,"ankur",25000,jobtitle.professor);
        Emp e5 = new Emp(105,"jatin",10000,jobtitle.peon);
        Emp e6 = new Emp(106,"kirtan",50000,jobtitle.principal);
        Emp e7 = new Emp(107,"rahul",8000,jobtitle.peon);
        Emp e8 = new Emp(108,"prince",16000,jobtitle.hod);
        Emp e9 = new Emp(109,"rohit",26000,jobtitle.professor);
        Emp e10 = new Emp(110,"virat",20000,jobtitle.hod);

        Emp[] employee = {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
        calculateSalary(employee);
    }

    public static void calculateSalary(Emp[] employee){
        int peonTotal = 0, profTotal = 0, hodTotal = 0, principalTotal = 0;

        for (int i = 0; i < employee.length; i++){
            jobtitle title = employee[i].title;
            int salary = employee[i].salary;

            if (title == jobtitle.peon) {
                peonTotal += salary;
            } else if (title == jobtitle.professor) {
                profTotal += salary;
            } else if (title == jobtitle.hod) {
                hodTotal += salary;
            } else if (title == jobtitle.principal) {
                principalTotal += salary;
            }
        }
        System.out.println("Peon : " + peonTotal);
        System.out.println("Professor : " + profTotal);
        System.out.println("HOD : " + hodTotal);
        System.out.println("Principal : " + principalTotal);
    }
}

class Emp{
    int e_id;
    String name;
    int salary;
    jobtitle title;

    public Emp(int e_id, String name, int salary, jobtitle title) {
        this.e_id = e_id;
        this.name = name;
        this.salary = salary;
        this.title = title;
    }
}

enum jobtitle{
    peon, professor, hod, principal
}