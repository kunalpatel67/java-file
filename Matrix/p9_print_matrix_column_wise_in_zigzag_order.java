package Matrix;

public class p9_print_matrix_column_wise_in_zigzag_order {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {5, 6, 7},
                {9, 10, 11},
                {13, 14, 15}};
        int row = mat.length;
        int col = mat[0].length;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++) {
                if (j % 2 == 0) {
                    System.out.print(mat[i][j]+" ");
                } else {
                    System.out.print(mat[row - i - 1][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
