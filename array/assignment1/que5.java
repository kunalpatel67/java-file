package array.assignment1;

public class que5 {

    public static boolean isprime(int n) {
        if (n < 2){
            return false;
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,6,7,21,11,15,5,2};

        for (int i = 0; i < arr.length; i++){
            if (isprime(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }
}
