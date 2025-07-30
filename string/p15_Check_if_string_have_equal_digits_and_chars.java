package string;

public class p15_Check_if_string_have_equal_digits_and_chars {
    public static void main(String[] args) {
        String s = "hello12345";
        char[] chars = s.toCharArray();
        int countDigit = 0, countChar = 0;

        for (int i = 0; i < chars.length; i++){
            if (chars[i] >= '0' && chars[i] <= '9'){
                countDigit++;
            }
            else if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')){
                countChar++;
            }
        }
        if (countDigit == countChar){
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }
    }
}
