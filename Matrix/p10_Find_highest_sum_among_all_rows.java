package Matrix;

public class p10_Find_highest_sum_among_all_rows {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}};

        int row = mat.length , col = mat[0].length;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < row; i++){
            int sum = 0;
            for (int j = 0; j < col; j++){
                sum += mat[i][j];
            }
            if (sum > maxsum){
                maxsum = sum;
            }
        }
        System.out.println(maxsum);
    }
}
