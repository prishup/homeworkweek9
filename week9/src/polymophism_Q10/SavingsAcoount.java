package polymophism_Q10;

public class SavingsAcoount extends BankAccount{
    public static void main(String[] args) {
        SavingsAcoount obj = new SavingsAcoount();
        obj.withdraw(600);
    }
    @Override
    public void withdraw(int withdrawLimit) {
        if (withdrawLimit<100){
            System.out.println("Fees of withdrawal  - "+2*withdrawLimit/100);
        }
        else{
            System.out.println("Fees of withdrawal - " +.60*withdrawLimit/100);
        }
    }
}
