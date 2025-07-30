package string;

public class p12_find_duplicate_chars_from_string {
    public static void main(String[] args) {
        String str = "programming";
        int[] count = new int[128];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < 128; i++) {
            if (count[i] > 1) {
                System.out.print((char) i + " ");
            }
        }
    }
}