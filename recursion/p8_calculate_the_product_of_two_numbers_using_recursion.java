package recursion;

public class p8_calculate_the_product_of_two_numbers_using_recursion {
    public static void main(String[] args) {
        int a = 8, b = 10;
        int c = 10, d = 5;
        System.out.println(product(a,b));
        System.out.println(product(c,d));
    }
    private static int product(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + product(a, b - 1);
    }
}
