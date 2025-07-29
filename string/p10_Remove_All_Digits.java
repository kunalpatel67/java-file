package string;

public class p10_Remove_All_Digits {
    public static void main(String[] args) {
        String s = "0kun58746al123";
        String demo = "";

        for (int i = 0; i < s.length(); i++){
            char currChar = s.charAt(i);
            //Ascii values like 0 = 48, 1 = 49
            if (currChar == 48 || currChar == 49 || currChar == 50 || currChar == 51 || currChar == 52 || currChar == 53 || currChar == 54 || currChar == 55 || currChar == 56 || currChar == 57){
                continue;
            }
            else {
                demo = demo + s.charAt(i);
            }
        }
        System.out.println(demo);
    }
}
