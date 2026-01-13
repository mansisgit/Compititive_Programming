import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,3};

//first sorting the array and then returning the length of the sorted part only
        int compare_index = 0;
        int fast = 1;
        while(compare_index <arr.length-1 && fast <arr.length){
            if(arr[compare_index] == arr[fast]) fast++;
            else {
                arr[compare_index+1] = arr[fast];
                compare_index ++;
            }

        }

        System.out.println(Arrays.toString(arr));

        }
    }

