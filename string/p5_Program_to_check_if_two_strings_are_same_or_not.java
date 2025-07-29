package string;

public class p5_Program_to_check_if_two_strings_are_same_or_not {
    public static void main(String[] args) {
        String s1 = "kunal";
        String s2 = "kunal";

        if (s1.length() != s2.length()){
            System.out.println("False");
            return;
        }

        for (int i = 0 ; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}
