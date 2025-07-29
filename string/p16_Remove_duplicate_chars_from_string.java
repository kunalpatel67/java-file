package string;

public class p16_Remove_duplicate_chars_from_string {
    public static void main(String[] args) {
        String s = "hello";
        String ans = "";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++){
            boolean already = false;

            for (int j = 0; j < i; j++){
                if (chars[i] == chars[j]){
                    already = true;
                    break;
                }
            }

            if (already){
                continue;
            }

            ans = ans + chars[i];
        }
        System.out.println(ans);
    }
}
