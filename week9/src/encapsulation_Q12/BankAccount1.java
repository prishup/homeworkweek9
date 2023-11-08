package encapsulation_Q12;

public class BankAccount1 extends BankAccount { // encapsulation of bank account
    public static void main(String[] args) {
        BankAccount1 t = new BankAccount1();
        t.setAccountNumber(2028);
        t.setBalance(250000);

        System.out.println("Account Number - " +t.getAccountNumber());
        System.out.println("Balance  - " +t.getBalance());
    }
}
