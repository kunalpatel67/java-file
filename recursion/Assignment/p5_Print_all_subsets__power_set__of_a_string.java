package recursion.Assignment;

public class p5_Print_all_subsets__power_set__of_a_string {
    public static void main(String[] args) {
        String s = "abc";
        printSubsets("", s);
    }

    public static void printSubsets(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            if (!processed.isEmpty()) System.out.print(processed + " "); // skip empty subset
            return;
        }

        char ch = unprocessed.charAt(0);

        // include current character
        printSubsets(processed + ch, unprocessed.substring(1));

        // exclude current character
        printSubsets(processed, unprocessed.substring(1));
    }
}
