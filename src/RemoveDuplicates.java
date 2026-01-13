import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,3,3};
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]) i++;
                else
            }
        }
        System.out.println(Arrays.toString(arr));

        }
    }

