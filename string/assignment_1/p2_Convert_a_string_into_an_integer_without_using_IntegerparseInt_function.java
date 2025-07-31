package string.assignment_1;

public class p2_Convert_a_string_into_an_integer_without_using_IntegerparseInt_function {
    public static void main(String[] args) {
        String s = "2563";
        int ans = 0;

        for (int i = 0; i < s.length(); i++){
            int digit = s.charAt(i) - '0';
            ans = (ans*10) + digit;
        }
        System.out.println(ans);
    }
}
