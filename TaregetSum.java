import java.util.Arrays;

public class TaregetSum {
    public static int[] twoSum(int nums[] , int target){
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ;j < nums.length ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1};
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 19;
        int res[] = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
