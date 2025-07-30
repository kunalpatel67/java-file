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

/*
    public static void main(String[] args) {
        String s = "madam nitin eye";
        int left = 0;
        boolean allPalindrome = true;

        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                boolean isPalin = isPalindrome(s, left, i - 1);

                if (!isPalin) {
                    allPalindrome = false;
                    System.out.println(allPalindrome);
                    return;
                }

                left = i + 1;
            }
        }

        System.out.println(allPalindrome);
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
*/
