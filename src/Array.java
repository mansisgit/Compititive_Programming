public class Array {
    public static void main(String[] args) {
        //write a code to find a factor of each element in an array
        int[] arr = {10,15,21,33,40};
        for(int ele: arr){
            System.out.println("Factors of "+ele+" are: ");
            for(int i=1;i<ele;i++){
                if(ele%i==0){
                    System.out.print(i+" ");
                }
                //hi
            }
            System.out.println();
        }
    }
}
//1552//stocks buy and sell time 121//remove duplicates 26