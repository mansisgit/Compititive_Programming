public class Program {
    public static void main(String[] args) {

        //to check if a number is power of 2 or not using bitwise operator
        int n = 16;
        if((n & n-1) == 0) System.out.println("Power of 2");
        else System.out.println("Not a power of 2");

        //write a code to check if a number is even or odd using bitwise operator
        int num = 29;
        if((num & 1) == 1) System.out.println("Odd");//() is required as == has more precedence than &
        else System.out.println("Even");

        //swap two numbers without using third variable
        int a = 5;
        int b = 10;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: "+a+" b: "+b);

        //write a code to find the product of a number with the power of 2 using bitwise operators
        int number = 7;
        int power = 3;

        System.out.println(number << power); //7 * 2^3 = 56 left shift by power bits is equivalent to multiplying by 2^power
        System.out.println(number >> power); //7 / 2^3 = 0 right shift by power bits is equivalent to dividing by 2^power

        //msb(most significant bit) of a number
        int val = 18; //binary representation 10010
        int power1 = 0;
        while (val>1){
            val = val>>power1;
            power1++;
        }
        System.out.println("MSB is at position: "+power1);

        //------------------------------------------------Bit Manipulation---------------------------------------
        //write a code to toggle the nth bit of a number
        int c = 5; //101
        int nthbit = 1;
        System.out.println( c ^ (1<<nthbit));

        //to check if the sign of the number are same or different (+/-)
        int x=5;//101
        int y=-3;//110 ---> 2's compliment
        if((x^y)<0) System.out.println("Different signs");
        else System.out.println("Same signs");

    }
}
