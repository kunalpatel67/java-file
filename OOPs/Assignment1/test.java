package OOPs.Assignment1;

public class test {
    public static void main(String[] args) {
        p1student s4 = new p1student();
        s4.setStudDetails(4,"parth",60,60,60);
        s4.calculateTotal();
        s4.displayStudDetails();

        p3account acc2 = new p3account();
        acc2.setAccountDetails(6705,"rahul",120000);
        acc2.deposit(10000);
        acc2.displayAccDetails();
    }
}
