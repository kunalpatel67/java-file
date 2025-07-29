package string;

public class p13_Merge_two_Strings_of_same_length_Alternatively {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "bbb";
        char[] chars = new char[s1.length() * 2];
        int c = 0;

        if (s1.length() != s2.length()){
            System.out.println("Enter same length for both string");
            return;
        }

        for (int i = 0; i < s1.length(); i++){
            chars[c] = s1.charAt(i);
            c++;
            chars[c] = s2.charAt(i);
            c++;
        }
        String s3 = new String(chars);
        System.out.println(s3);
    }
}
