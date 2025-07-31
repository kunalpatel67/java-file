package string.assignment_1;

public class p4_pattern {
    public static void main(String[] args) {
        String s = "PROGRAM";

        for (int i = 1; i <= s.length(); i++){
            System.out.println(s.substring(0,i));
        }
    }
}
