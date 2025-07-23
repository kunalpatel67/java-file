package OOPs.Keyword;

public class final_keyword {
    public static void main(String[] args) {
        int a = 10;
        a = 30; // We can change value of a

        final int dayOfWeek = 7; // Can't change value using final keyword
    }
}

final class bank{ // Final class can't be extended
    public final void printInterestRate(){ // Final method can't be overridden
        System.out.println(4);
    }
}

//class sbi extends bank{
//
//}
