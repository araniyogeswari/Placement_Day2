    abstract class BankAccount{
    abstract double calculateInterest();
    void displayAccountType(){
        System.out.println("Bank Account Details");
    }
    
    double balance;
    }
    class SavingsAccount extends BankAccount{
        @Override
        double calculateInterest(){
            return balance * 0.05;
        }
    }
class Task_22{
    public static void main (String [] args){
        SavingsAccount sa = new SavingsAccount();
        sa.balance = 50000;
        sa.displayAccountType();
        System.out.println("Calculated Interest: " + sa.calculateInterest());
    }
}
    