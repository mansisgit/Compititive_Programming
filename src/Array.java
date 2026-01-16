public class Array {
    public static void main(String[] args) {
        //write a code to find a factor of each element in an array
        int[] arr = {10,15,21,33,40};
        int[] nums = new int[2];
       // nums = {1,2};

        for(int ele: arr){
            System.out.println("Factors of "+ele+" are: ");
            for(int i=1;i<ele;i++){
                if(ele%i==0){
                    System.out.print(i+" ");
                }

            }
            System.out.println();
        }
        String name = "tab";
        StringBuilder br = new StringBuilder(name);
        System.out.println(name);

        System.out.println(name.substring(0,2));//excluding 2
        System.out.println("all substrigs L->R sequence");
        for(int i=0;i<=name.length()-1;i++){
            for(int j=i+1;j<=name.length();j++) {
                String k = name.substring(i,j);
                System.out.println("\"" + k + "\"");
            }
        }
        System.out.println("runnnn");
        name = name.replace('t','b');
        System.out.println(name);
        System.out.println(br.reverse().toString());

    }
}
//1552//stocks buy and sell time 121//remove duplicates 26