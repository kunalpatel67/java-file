package array;

public class Find_the_common_elements_between_two_arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,9,4,1};

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}
