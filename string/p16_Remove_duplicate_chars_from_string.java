package string;

public class p16_Remove_duplicate_chars_from_string {
    public static void main(String[] args) {
        String str = "programming";
        int[] count = new int[128];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (count[ch] == 0){
                System.out.print(ch);
                count[ch] = 1;
            }
        }
    }
}
