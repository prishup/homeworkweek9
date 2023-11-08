package polymophism_Q10;

public class CheckingAccount extends BankAccount {
    public static void main(String[] args) {
        CheckingAccount obj = new CheckingAccount();
        obj.withdraw(300);

    }

    @Override
    public void withdraw(int withdrawLimit) {
        if (withdrawLimit<500){

            System.out.println("Fees of withdrawal  - "+3*withdrawLimit/100);
        }
        else{
            System.out.println("Fees of withdrawal - " +1*withdrawLimit/100);
        }
    }
}

