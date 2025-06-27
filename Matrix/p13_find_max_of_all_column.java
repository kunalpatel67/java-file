package Matrix;

public class p13_find_max_of_all_column {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};

        int row = mat.length , col = mat[0].length;

        for (int i = 0; i < col; i++){
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < row; j++){
                if (mat[j][i] > max){
                    max = mat[j][i];
                }
            }
            System.out.print(max + " ");
        }
    }
}
