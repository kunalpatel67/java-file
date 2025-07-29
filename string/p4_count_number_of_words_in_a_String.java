package string;

public class p4_count_number_of_words_in_a_String {
    public static void main(String[] args) {
        String s = "hello good morning";
        String[] strings = s.trim().split(" ");

        System.out.println(strings.length);
    }
}
