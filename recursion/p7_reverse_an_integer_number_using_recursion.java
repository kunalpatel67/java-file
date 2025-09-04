package recursion;

public class p7_reverse_an_integer_number_using_recursion {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(revNum(num,0));
    }
    private static int revNum(int num, int rev) {
        if (num == 0){
            return rev;
        }
        int last = num % 10;
        rev = (rev*10) + last;
        return revNum(num/10,rev);
    }
}
