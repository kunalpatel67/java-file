package Matrix;

public class p2_print {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};

        int row = mat.length;
        int col = mat[0].length;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
