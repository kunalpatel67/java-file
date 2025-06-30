package Matrix;

public class p20_Find_element_from_sorted_matrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,3,5,8},
                {10,13,15,19},
                {22,25,29,32},
                {35,39,42,45},
        };

        int row = mat.length;
        int col = mat[0].length;
        int k = 1;
        int left = 0, right = row * col - 1;

        while (left <= right){
            int mid = (left+right) / 2;
            int midVal = mat[mid / col][mid % col];

            if (midVal == k){
                System.out.println("present");
                return;
            }
            else if (k > midVal){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        System.out.println("not present");
    }
}
// time com = O(Log(row*col))