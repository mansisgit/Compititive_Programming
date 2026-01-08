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

        //write a code to toggle the nth bit of a number
        int c = 5; //101
        int nthbit = 1;
        System.out.println( c ^ (1<<nthbit));

        //to check if the sign of the number are same or different (+/-) ??
        int x=5;//0000 0101
        int y=-3;//1111 1101
        if((x ^ y)<0){
            System.out.println("Different signs");
        } else {
            System.out.println("Same signs");
        }

        //write a code to clear the nth bit of number
        int d = 15;//1111
        int nbit = 2;
        System.out.println(d & ~(1<<nbit));

        //write a code to change the nth bit to 1
        System.out.println(d | (1<<nbit));

        //find single number using bitwise operator
        System.out.println("unique number");
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
        int unique = 0;
        for(int i : arr){
            unique = unique ^ i;//*^*-->0---->*^0-->*
        }
        System.out.println(unique);


        //write a code to find a missing number in arr using bitwise
        int[] array = {1,2,3,4,6,7,8,9,10};//5 is missing
        int count = array.length+1;
        int xor =0;
        for(int ele : array){
            xor = ele^xor;
        }
        int xor2=0;
        for(int i=1;i<count+1;i++){
            xor2 = xor2 ^ i;
        }
        System.out.println(xor ^ xor2);
    }
}
