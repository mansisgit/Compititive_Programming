import java.util.Scanner;

class BankAccount {
    static int bankBalance;
    int accountNo;
    String name;

    BankAccount(int account_No,String name,int bankBalance){
        accountNo=account_No;
        this.name=name;
        this.bankBalance=bankBalance;
    }

    public static void WorkingHours(){
        System.out.println("opening time 10am");
        System.out.println("closing time 4pmdd");
        System.out.println(bankBalance);//static method static variable
        //System.out.println(name); static method NO non static variable
    }

    public void deposit(int amount){
        bankBalance+=amount;//non static method static variable

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
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name:");
//        String name = sc.nextLine();
//        System.out.println("Enter account number: ");
//        int accountNo = sc.nextInt();


        //oject creation
        BankAccount a1 = new BankAccount(5421,"rahul",1000);
        BankAccount a2 = new BankAccount(5422,"riya",1500);
        //BankAccount.deposit(1000);
        a1.checkBalance();
        BankAccount.WorkingHours();//static calling static
        int n = Integer.parseInt("100");


//        System.out.println("Enter the operation:");
//        System.out.println("1:deposite"+"----"+"2.withdraw"+"-----"+"3.balance");
//        int choice = sc.nextInt();
//        switch (choice){
//            case 1 -> obj.deposit(sc.nextInt());
//            case 2 -> obj.withdraw(sc.nextInt());
//            case 3 -> obj.checkBalance();
//        }
    }
}

interface Animal{
    public String sound();
}
class Dog extends Animal{

}
class Cat extends Animal{

}
class Cow extends Animal{

}

