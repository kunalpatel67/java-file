package string.assignment_1;
import java.util.Arrays;


public class p3_Check_if_two_strings_are_permuting_each_other_or_not {
    public static void main(String[] args) {
        String s1 = "abac";
        String s2 = "aabc";
        int[] count1=new int[128];
        int[] count2=new int[128];


        if(s1.length()==s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                int ascii = s1.charAt(i);
                count1[ascii] = count1[ascii] + 1;
            }
            for (int i = 0; i < s2.length(); i++) {
                int ascii = s2.charAt(i);
                count2[ascii] = count2[ascii] + 1;
            }
            System.out.println(Arrays.equals(count1, count2));
        }
        else {
            System.out.println("false");
        }
    }
}
