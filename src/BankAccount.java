public class BankAccount {
    int bankBalance;
    int accountNo;
    String name;

    public void deposit(int amount){
        bankBalance+=amount;
    }

    public void withdraw(int amount){
        bankBalance-=amount;
    }

    public void checkBalance(){
        System.out.println("Total Balance: "+bankBalance);
    }

}
