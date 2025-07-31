package string.assignment_1;

public class p5_sum_two_char_arrray {
    public static void main(String[] args) {
        char[] chars1 = {'5','2','3'};
        char[] chars2 = {'1','6','2'};
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < chars1.length; i++){
            sum1 = (sum1 * 10) + chars1[i] - '0';
        }

        for (int i = 0; i < chars2.length; i++){
            sum2 = (sum2 * 10) + chars2[i] - '0';
        }

        System.out.println(sum1+sum2);
    }
}
