package string;

public class p12_find_duplicate_chars_from_string {
    public static void main(String[] args) {
        String s = "heelloo";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length-1; i++){
            boolean already = false;
            for (int k = 0; k < i; k++) {
                if (chars[i] == chars[k]) {
                    already = true;
                    break;
                }
            }
            if (already) {
                continue;
            }
            for (int j = i+1; j < chars.length; j++){
                if (chars[i] == chars[j]){
                    System.out.print(chars[i]);
                    break;
                }
            }
        }
    }
}
