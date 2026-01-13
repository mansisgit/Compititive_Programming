import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,3,3};
        int n= arr.length;
        int slow =0;
        int fast = 1;

        while(slow <n-2 && fast<n){
           if(arr[slow] == arr[fast]) fast++;
           else{
               arr[slow+1] = arr[fast];
               slow++;
           }
        }
        System.out.println(Arrays.toString(arr));

        }
    }

