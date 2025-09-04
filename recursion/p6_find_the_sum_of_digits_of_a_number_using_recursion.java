package recursion;

public class p6_find_the_sum_of_digits_of_a_number_using_recursion {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(sum(num));
    }
    private static int sum(int num){
        if (num == 0){
            return 0;
        }
        int last = num % 10;
        num = num/10;
        return last + sum(num);
    }
}
