package OOPs.Polymorphism;

public class compileTime_MethodOverloading {
    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        sum(10.5,20.5);
    }
    private static void sum(int a, int b){
        System.out.println(a+b);
    }

    // Method Overloading by changing number of argument
    private static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    // Method Overloading by changing type of argument
    private static void sum(double a, double b){
        System.out.println(a+b);
    }

    // Method overloading not possible by changing return type
//    private static int sum(int a, int b){
//        return a+b;
//    }
}