package Matrix;

public class p5_reverse_print {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};

        int row = mat.length , col = mat[0].length;

        for (int i = row-1; i >= 0; i--){
            for (int j = col-1; j >= 0; j--){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
