package array;

public class print_alternative_element {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};

        for (int i = 0; i < arr.length; i++){  //or for(int i = 0; i < arr.length; i = i + 2); s.o.p(arr[i]);
            if(i % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
