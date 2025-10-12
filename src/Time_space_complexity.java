public class Time_space_complexity {

    public static int getFirstEle(int[] arr){
        return arr[0];
    } //---->O(1)

    public static int binarySearch(int[] arr,int target){
        int left =0,right=arr.length-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target) return mid;
            else if (arr[mid] > target) {
                right=mid-1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }//---->O(logn)

    public static void main(String[] args) {
        System.out.println(getFirstEle(new int[] {1,2,3}));
    }
}
