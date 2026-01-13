import java.util.Arrays;

public class RotateToRight {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k =1;
        int n = nums.length;
        while(k>0) {
            for (int i = 0; i < n+1; i++) {
                int temp = nums[n - 1];//7
                nums[i+1] = nums[i];//1,1,2,3,4,5,6
                nums[0] = temp;//7,1,2,3,4,5,6
            }
            k--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
