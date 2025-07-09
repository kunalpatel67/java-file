/*3. Create a class Account with the attributes accountNo, custName,
accountBalance.
methods:-
setAccountDetails() which set the values to these attributes.
withdraw() which subtracts the given amount from the available balance
deposit() which adds a given amount to the available balance and
displayAccountDetails() which displays accountNo, custName,accountBalance.
Create a class Main1 which contains the main() method to test the functionality of
Account class.
*/

package OOPs.Assignment1;

public class p3 {
    public static void main(String[] args) {
        p3account acc1 = new p3account();
        acc1.setAccountDetails(1020,"Kunal",215000);
        acc1.withdraw(5000);
        acc1.displayAccDetails();
        System.out.println();

        p3account acc2 = new p3account();
        acc2.setAccountDetails(1056,"parth",200000);
        acc2.deposit(15000);
        acc2.displayAccDetails();
        System.out.println();

        p3account acc3 = new p3account();
        acc3.setAccountDetails(1096,"jenish",100000);
        acc3.withdraw(100000);
        acc3.displayAccDetails();
    }
}

class p3account{
    int accountNo;
    String custName;
    double balance;

    public void setAccountDetails(int accountNo,String custName,double balance){
        this.accountNo = accountNo;
        this.custName = custName;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println(amount + " deposited successfully");
    }

    public void withdraw(int amount){
        if (amount > balance){
            System.out.println("Insufficient Balance!");
        }
        else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully");
        }
    }

    public void displayAccDetails(){
        System.out.println("Account No: " + accountNo);
        System.out.println("Customer Name: " + custName);
        System.out.println("Balance: " + balance);
    }
}
