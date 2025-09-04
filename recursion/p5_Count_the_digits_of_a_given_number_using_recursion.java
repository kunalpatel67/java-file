package recursion;

public class p5_Count_the_digits_of_a_given_number_using_recursion {
    public static void main(String[] args) {
        int num = 12563;
        System.out.println(countDigit(num));
    }

    private static int countDigit(int num) {
        if (num == 0) return 0;
        return 1 + countDigit(num / 10);
    }
}
