package string;

public class p10_Remove_All_Digits {
    public static void main(String[] args) {
        String s = "0kun58746al123";
        String demo = "";

        for (int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            if (currChar >= '0' && currChar <= '9'){
                continue;
            }
            else {
                demo = demo + s.charAt(i);
            }
        }
        System.out.println(demo);
    }
}
