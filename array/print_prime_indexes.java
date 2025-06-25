package array;

public class print_prime_indexes {
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

        int[] arr = {10,20,30,40,50,60,70,80,90};

        for (int i = 0; i < arr.length; i++){
            if (isprime(i)){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

