package string;

public class p1_Print_a_string_in_reverse_order {
    public static void main(String[] args) {
        String s = "kunal";
        int n = s.length();

        for (int i = n-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
