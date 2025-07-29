package string;

public class p2_Reverse_a_String {
    public static void main(String[] args) {
        String s = "kunal";
        int n = s.length();

        char[] chars = s.toCharArray();
        int l = 0, r = n-1;

        while (l < r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        s = new String(chars);
        System.out.println(s);
    }
}
