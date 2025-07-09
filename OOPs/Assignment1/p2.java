/*2. Create a class p2account with p2accountNumber, custName, balance and
interest rate.
create method calculateInterest() which will calculate interest
and add to balance.
create a method to displayp2accountDetails()*/

package OOPs.Assignment1;

public class p2 {
    public static void main(String[] args) {
        p2account acc1 = new p2account();
        acc1.accountNumber = 1020;
        acc1.custName = "Kunal";
        acc1.balance = 10000;
        acc1.interestRate = 5;
        acc1.calculateInterest();
        acc1.displayp2accountDetails();
        System.out.println();

        p2account acc2 = new p2account();
        acc2.accountNumber = 1056;
        acc2.custName = "parth";
        acc2.balance = 20000;
        acc2.interestRate = 10;
        acc2.calculateInterest();
        acc2.displayp2accountDetails();
        System.out.println();

        p2account acc3 = new p2account();
        acc3.accountNumber = 1084;
        acc3.custName = "Jenish";
        acc3.balance = 15000;
        acc3.interestRate = 7;
        acc3.calculateInterest();
        acc3.displayp2accountDetails();
    }
}

class p2account{
    int accountNumber;
    String custName;
    double balance;
    double interestRate;

    public void calculateInterest(){
        double interest = (balance * interestRate) / 100;
        balance = balance+interest;
    }

    public void displayp2accountDetails(){
        System.out.println("account No: " + accountNumber);
        System.out.println("Customer Name: " + custName);
        System.out.println("Total Balance(With interest rate): " + balance);
    }
}
