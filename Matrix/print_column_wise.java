package Matrix;

public class print_column_wise {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};

        int row = mat.length , col = mat[0].length;

        for(int i = 0; i < col; i++){
            for (int j = 0; j < row; j++){
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }
}
