package string.assignment_1;

public class p1_Swap_two_strings_of_same_size_without_using_third_string {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";

        if (s1.length() != s2.length()){
            System.out.println("String length is different");
            return;
        }

        s1 = s1 + s2;
        s2 = s1.substring(0,s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println(s1);
        System.out.println(s2);

    }
}
