import java.util.Scanner;

import java.util.*;
class InsufficientFundExcepion extends Exception{
    InsufficientFundExcepion(String message){
        super(message);
    }
}
public class A {

    public static void main(String[] args) throws InsufficientFundExcepion {
        //infficient fund exception
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        if (balance < 1000) {
            throw new InsufficientFundExcepion("not more than 1000");
        } else {
            System.out.println("you are eligible");
        }
    }
}


