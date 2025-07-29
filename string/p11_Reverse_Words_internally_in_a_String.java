package string;

import java.util.Arrays;

public class p11_Reverse_Words_internally_in_a_String {
    public static void main(String[] args) {
        String s = "good morning";
        String demo = "";
        String[] strings = s.split(" ");

        for (int i = 0; i < strings.length; i++){
            String currStr = strings[i];
            char[] chars = currStr.toCharArray();

            int left = 0, right = chars.length-1;
            while (left < right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            demo = demo + new String(chars) + " ";
        }
        s = demo;
        System.out.println(s);
    }
}
