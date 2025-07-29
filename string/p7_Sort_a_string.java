package string;

public class p7_Sort_a_string {
    public static void main(String[] args) {
        String s = "helloabc";
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length-1; i++){
            for (int j = 0; j < chars.length-1-i; j++){
                if (chars[j] > chars[j+1]){
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }
        }
        s = new String(chars);
        System.out.println(s);
    }
}
