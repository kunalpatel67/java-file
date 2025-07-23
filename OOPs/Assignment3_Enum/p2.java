package OOPs.Assignment3_Enum;

public class p2 {
    public static void main(String[] args) {
        Salryslip s1 = new Salryslip(1001, "kunal", 40200, 1);
        Salryslip s2 = new Salryslip(1002, "parth", 19850, 1);
        Salryslip s3 = new Salryslip(1003, "ravi", 24800, 1);
        Salryslip s4 = new Salryslip(1004, "amit", 30500, 1);
        Salryslip s5 = new Salryslip(1005, "milan", 39600, 1);
        Salryslip s6 = new Salryslip(1006, "jenish", 15200, 1);

        Salryslip s7 = new Salryslip(1001, "kunal", 3500,2);
        Salryslip s8 = new Salryslip(1002, "parth", 20200, 2);
        Salryslip s9 = new Salryslip(1003, "ravi", 30500, 2);
        Salryslip s10 = new Salryslip(1004, "amit", 29800, 2);
        Salryslip s11 = new Salryslip(1005, "milan", 18350, 2);
        Salryslip s12 = new Salryslip(1006, "jenish", 14900, 2);

        Salryslip s13 = new Salryslip(1001, "kunal", 41000, 3);
        Salryslip s14 = new Salryslip(1002, "parth", 19900, 3);
        Salryslip s15 = new Salryslip(1003, "ravi", 24300, 3);
        Salryslip s16 = new Salryslip(1004, "amit", 31200, 3);
        Salryslip s17 = new Salryslip(1005, "milan", 17800,3);
        Salryslip s18 = new Salryslip(1006, "jenish", 45400, 3);

        Salryslip s19 = new Salryslip(1001, "kunal", 39900, 4);
        Salryslip s20 = new Salryslip(1002, "parth", 20500, 4);
        Salryslip s21 = new Salryslip(1003, "ravi", 45100, 4);
        Salryslip s22 = new Salryslip(1004, "amit", 30650, 4);
        Salryslip s23 = new Salryslip(1005, "milan", 18050, 4);
        Salryslip s24 = new Salryslip(1006, "jenish", 14700, 4);

        Salryslip s25 = new Salryslip(1001, "kunal", 20700,5);
        Salryslip s26 = new Salryslip(1002, "parth", 20000, 5);
        Salryslip s27 = new Salryslip(1003, "ravi", 25600,5);
        Salryslip s28 = new Salryslip(1004, "amit", 29900, 5);
        Salryslip s29 = new Salryslip(1005, "milan", 38200, 5);
        Salryslip s30 = new Salryslip(1006, "jenish", 15100, 5);

        Salryslip s31 = new Salryslip(1001, "kunal", 40050, 6);
        Salryslip s32 = new Salryslip(1002, "parth", 20300, 6);
        Salryslip s33 = new Salryslip(1003, "ravi", 24850, 6);
        Salryslip s34 = new Salryslip(1004, "amit", 31000, 6);
        Salryslip s35 = new Salryslip(1005, "milan", 17700, 6);
        Salryslip s36 = new Salryslip(1006, "jenish", 15300, 6);

        Salryslip[] slips = {s1, s2, s3, s4, s5, s6,
                s7, s8, s9, s10, s11, s12,
                s13, s14, s15, s16, s17, s18,
                s19, s20, s21, s22, s23, s24,
                s25, s26, s27, s28, s29, s30,
                s31, s32, s33, s34, s35, s36
        };

        for (int i = 1; i <= 6; i++){
            int max1 = -1, max2 = -1;
            int id1 = -1, id2 = -1;
            String name1 = null,name2 = null;

            for (int j = 0; j < slips.length; j++){
                if (slips[j].month == i){
                    if (slips[j].salary > max1){
                        max2 = max1;
                        id2 = id1;
                        name2 = name1;
                        max1 = slips[j].salary;
                        id1 = slips[j].e_id;
                        name1 = slips[j].name;
                    }
                    else if (slips[j].salary > max2){
                        max2 = slips[j].salary;
                        id2 = slips[j].e_id;
                        name2 = slips[j].name;
                    }
                }
            }
            System.out.println("Month " + i + " = " + id1 + ", " + id2); // only print id
//            System.out.println("Month " + i + " = "  + name1 + " -" + " " + name2); // only print name
//            System.out.println("Month " + i + ":" + " " + name1 + "-" + id1 + "," + " " + name2 + "-" + id2); // print both id and name
        }
    }
}

class Salryslip{
    int e_id;
    String name;
    int salary;
    int month;

    public Salryslip(int e_id, String name, int salary, int month) {
        this.e_id = e_id;
        this.name = name;
        this.salary = salary;
        this.month = month;
    }
}
