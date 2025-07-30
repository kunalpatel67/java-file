package string;

public class p3_check_if_a_String_is_Palindrome {
    public static void main(String[] args) {
        String s = "nitin";
        int n = s.length();

        int l = 0, r = n - 1;

        while (l < r){
            if (s.charAt(l) != s.charAt(r)){
                System.out.println("Not palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("palindrome");
    }
}
