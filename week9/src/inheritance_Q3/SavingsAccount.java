package inheritance_Q3;

public class SavingsAccount extends BankAccount { //child class of BankAccount

    public static void main(String[] args) {
        SavingsAccount obj = new SavingsAccount();
        obj.withdraw(200);
    }
    @Override
    public void withdraw(int money) {

        if (money>100){
            System.out.println("Able to withdraw money ");
        }
        else{
            System.out.println("Not able to withdraw money");
        }
    }
}
