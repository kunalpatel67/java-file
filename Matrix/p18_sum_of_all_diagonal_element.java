package Matrix;

public class p18_sum_of_all_diagonal_element {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};

        int row = mat.length , col = mat[0].length;
        int sum = 0, j = row - 1;
        for (int i = 0; i < row; i++){
            sum = sum + mat[i][i];
            if (i != j){
                sum = sum + mat[i][j];
            }
            j--;
        }
        System.out.println(sum);
    }
}
