import java.util.Scanner;

class BankAccount {
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

 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter account number: ");
        int accountNo = sc.nextInt();

        //oject creation
        BankAccount obj = new BankAccount();

        System.out.println("Enter the operation:");
        System.out.print("1:deposite"+"----"+"2.withdraw"+"-----"+"3.balance");
        int choice = sc.nextInt();
        switch (choice){
            case 1 -> obj.deposit(sc.nextInt());
            case 2 -> obj.withdraw(sc.nextInt());
            case 3 -> obj.checkBalance();
        }
    }
}

