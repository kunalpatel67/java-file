package array;

public class find_missing_value {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,10};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++){
            int current = arr[i];
            int next = arr[i+1];

            if (next - current != 1){
                current++;
                System.out.println("missing value is:" + current);
            }
        }
    }
}
