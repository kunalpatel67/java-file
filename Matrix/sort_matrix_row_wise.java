package Matrix;

public class sort_matrix_row_wise {
    public static void main(String[] args) {
        int[][] mat = {
                {4,3,6},
                {8,5,2},
                {1,4,9},
                {2,5,3}
        };
        int row = mat.length;
        int col = mat[0].length;

        for (int k = 0; k < row; k++){
            for (int i = 0; i < col-1; i++){
                for (int j = 0; j < col-1-i; j++){
                    if (mat[k][j] > mat[k][j+1]){
                        int temp = mat[k][j];
                        mat[k][j] = mat[k][j+1];
                        mat[k][j+1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
