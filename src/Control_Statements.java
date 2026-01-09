public class Control_Statements {
    public static void main(String[] args) {
        boolean fine = true;
        if(true) System.out.println("hi");//if() must be a boolean data type
        //write a code to check the divisibility if number is divisible by both the number return both
        //if number is divisible by one of any number but not by second then return that number
        int a =30,b=5,c=10;
        if(a%b==0 && a%c==0) System.out.println("both");
        else if(a%b==0) System.out.println(b);
        else if(a%c==0) System.out.println(c);
        else System.out.println("None");

    }
}
