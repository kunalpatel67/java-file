package array;

public class check_palindrome_or_not {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};
        int n = arr.length;

        for (int i = 0; i < n; i++){
            if (arr[i] != arr[(n-i) - 1]){
                System.out.print("The array element is not palindrome");
                return;
            }
        }
        System.out.print("The array element is palindrome");

    }
}
