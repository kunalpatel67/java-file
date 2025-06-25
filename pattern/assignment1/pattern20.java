package pattern.assignment1;

public class pattern20 {

    public static void main(String[] args) {
        int n = 5;

        //upper block
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= n - i; k++){
                System.out.print("   ");
            }

            for(int j = 1; j <= i; j++){
                if(j == 1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }

            for(int j = 1; j < i; j++){
                if(j == i - 1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        //lower block
        for(int i = n - 1; i >= 1; i--){
            for(int k = 1; k <= n - i; k++){
                System.out.print("   ");
            }
            for(int j = 1; j <= i; j++){
                if(j == 1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            for(int j = 1; j < i; j++){
                if(j == i - 1){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

