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

        //write a code to find the arithmatic progression series where first number, nth number and difference will be given
        int first = 2;
        int nth = 50;
        int diff = 2;
        int count =0;
        int ele =0;
        while(ele<=nth){
            ele = first + (count*diff);
            System.out.print(ele + " ,");
            count++;
        }
        System.out.println();

        //write a code to find the digits of number
        int num=153;
        int element = num;
        int digit =0;
        int sum=0;
        while(element>0){
            element=element/10;
            digit++;
        }
        System.out.println(digit);

        //write a code for armstrong number
        element = num;
        while(element>0){

            int singledigi = element%10;
            sum+=Math.pow((int)singledigi,digit);
            element/=10;
        }
        if(sum==num) System.out.println("yes it is armstrong");
        else System.out.println("NO armstrong");

        for(int i=1;--i<=10;i+=2){//flow initialize-->condition-->execution-->increament
            //preincreament --> first increase the value then--> use it in condition
            System.out.println(i);
        }
        System.out.println("------------------");
        for(int i=1;i<=10;i++){
            System.out.println(i++);//postincreament --> first use the value in condition then --> increase it
        }
        System.out.println("------------------------------");
        //nested for loop to print a pattern

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i+j+" ");
            }
            System.out.println();

        }
        System.out.println("------------------------------");
        for(int i=5;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------");

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        for(int i=1;i<=5;i++){//uisng if else without 3 loops j-i type
            //for spaces
            for(int k=4;k>=i;k--){
                System.out.print(" ");
            }
            //for numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("------------------------------");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------------------");

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print((i+j)%2+" ");

            }
            System.out.println();
        }

        System.out.println("------------------------------");

        for(int i=1;i<=5;i++){
            //spaces
            for(int k=4;k>=i;k--){
                System.out.print(" ");
            }
            //increasing part
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //decreasing part
            for(int l=i-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }

    }
}
