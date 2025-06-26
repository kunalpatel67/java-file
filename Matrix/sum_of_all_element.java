package Matrix;

public class sum_of_all_element {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};

        int row = mat.length , col = mat[0].length;
        int sum = 0;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                sum += mat[i][j];
            }
        }
        System.out.println(sum);
    }
}
