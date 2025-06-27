package Matrix;

public class p3_find_element {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};

        int row = mat.length , col = mat[0].length;
        int k = 8;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                if (mat[i][j] == k){
                    System.out.println("present");
                    return;
                }
            }
        }
        System.out.println("not present");
    }
}
