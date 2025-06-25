package array.assignment2;

public class que3 {
    public static void main(String[] args) {
        int[] arr = {1,3,3,7,4,3,2,3,3,2,7,7};
        int k = 0, a = 0;

        for (int i = 0; i < arr.length; i++){
            int count = 0;
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > k){
                k = count;
                a = arr[i];
            }
        }
        System.out.println(a);
    }
}
