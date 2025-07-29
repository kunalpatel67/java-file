package string;

import java.util.Arrays;

public class p14_Check_if_all_words_are_palindrome_or_not {
    public static void main(String[] args) {
        String s = "madam eye nitin";
        String[] strings = s.split(" ");

        for (int i = 0; i < strings.length; i++){
            String currString = strings[i];
            char[] chars = currString.toCharArray();
            int left = 0, right = chars.length-1;

            while (left < right){
                if (chars[left] != chars[right]){
                    System.out.println("All words are not palindrome");
                    return;
                }
                left++;
                right--;
            }
        }
        System.out.println("All words are palindrome");
    }
}
