package recursion;

public class p2_Calculate_the_factorial_of_a_number_without_using_loop {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }
    private static int fact(int n){
        if (n == 1) {
            return 1;
        }
        return n * fact(n-1);
    }
}
