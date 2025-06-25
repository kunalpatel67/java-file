package array.arrayList;

import java.util.Arrays;

public class function {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int p = 0;

        p = insert(arr, p, 30);
        p = insert(arr, p, 10);
        p = insert(arr, p, 50);
        p = insert(arr, p, 40);
        p = insert(arr, p, 20);

        System.out.println("with sort:" + Arrays.toString(arr));

        update(arr, p, 20, 60);
        print(arr, p);

        p = delete(arr, p, 60); // remove 60, then sort
        print(arr, p);

        System.out.println("Find 30: " + find(arr, p, 30));
        System.out.println("Empty: " + isEmpty(arr, p));
        System.out.println("Size: " + size(arr, p));

    }

    public static int insert(int[] arr, int p, int value){
        if (p == arr.length){
            System.out.println("Array is full");
            return p;
        }

        arr[p] = value;
        p++;
        sort(arr, p);
        return p;
    }

    public static void print(int[] arr, int p){
        for (int i = 0; i < p; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void update(int[] arr, int p, int oldVal, int newVal){
        for (int i = 0; i < p; i++){
            if (arr[i] == oldVal){
                arr[i] = newVal;
                sort(arr, p);
                break;
            }
        }
    }

    public static boolean find(int[] arr, int p, int value){
        for (int i = 0; i < p; i++){
            if (arr[i] == value){
                return true;
            }
        }
        return false;
    }

    public static boolean isEmpty(int[] arr, int p){
        return p == 0;
    }

    public static int size(int[] arr, int p){
        return p;
    }

    public static int delete(int[] arr, int p, int value){
        for (int i = 0; i < p; i++){
            if (arr[i] == value){
                for (int j = i; j < p - 1; j++){
                    arr[j] = arr[j + 1];
                }
                p--;
                sort(arr, p);
                break;
            }
        }
        return p;
    }

    public static void sort(int[] arr, int p){
        for (int i = 0; i < p - 1; i++){
            for (int j = 0; j < p - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
