package array.function;

import java.util.Arrays;

public class fuctions {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int p = 0;
        p = insert(arr,p,10);
        p = insert(arr,p,20);
        p = insert(arr,p,30);
        p = insert(arr,p,40);
        p = insert(arr,p,50);

        update(arr,p,20,200);

        p = delete(arr,p,200);

        System.out.println("find: " + find(arr,p,200));

        System.out.println("Empty: " + isEmpty(arr,p));

        System.out.println("Size: " + size(arr,p));

        print(arr,p);
    }

    public static int insert(int[] arr, int p, int value){
        if (arr.length == p){
            System.out.println("Array is full");
            return p;
        }

        arr[p] = value;
        p++;
        return p;
    }

    public static void print(int[] arr, int p){
        for (int i = 0; i < p; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void update(int[] arr, int p, int oldVal, int newVal){
        for (int i = 0; i < p; i++){
            if (arr[i] == oldVal){
                arr[i] = newVal;
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
        if (p == 0){
            return true;
        }
        return false;
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
            }
        }
        return p;
    }
}
