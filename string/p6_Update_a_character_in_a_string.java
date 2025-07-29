package string;

public class p6_Update_a_character_in_a_string {
    public static void main(String[] args) {
        String s = "kunal";
        String demo = "";
        char old = 'k', new1 = 'p';

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == old){
                demo = demo + new1;
            }
            else {
                demo = demo + s.charAt(i);
            }
        }
        s = demo;
        System.out.println(s);
    }
}
