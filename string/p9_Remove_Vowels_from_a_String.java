package string;

public class p9_Remove_Vowels_from_a_String {
    public static void main(String[] args) {
        String s = "kunal";
        String demo = "";

        for (int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            if (currChar == 'a' || currChar == 'e' || currChar == 'i' || currChar == 'o' || currChar == 'u'){
                continue;
            }
            else {
                demo = demo + s.charAt(i);
            }
        }
        s = demo;
        System.out.println(s);
    }
}
