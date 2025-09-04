package recursion;

public class p1_Infinite_recursive_function {
    static int c = 1;
    public static void main(String[] args) {
        hello();
    }

    private static void hello() {
        if (c == 101){
            return;
        }
        System.out.println(c + " " + "hello");
        c++;
        hello();
    }
}
