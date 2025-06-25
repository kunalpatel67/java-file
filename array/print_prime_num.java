package array;

public class print_prime_num {
    public static boolean isprime(int n){
        if (n < 2){
            return false; // not prime
        }

        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false; //not prime
            }
        }
        return true; //prime
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};

        for (int i = 0; i < arr.length; i++){
            if (isprime(arr[i])){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
