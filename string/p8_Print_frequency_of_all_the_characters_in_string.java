package string;

public class p8_Print_frequency_of_all_the_characters_in_string {
    public static void main(String[] args) {
        String s = "hello good morning";
        int[] count = new int[128];

        for (int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            int ascii = currChar;
            count[ascii] = count[ascii] + 1;
        }

        for (int i = 0; i < 128; i++){
            if (count[i] > 0){
                System.out.println((char) i + " " + count[i]);
            }
        }
    }
}
