// [80, 60, 10, 50, 30, 100, 0, 50]
// Find pairs whose sum = 100;
// What will be the complexity for it?
// time complexity = O(n)

import java.util.HashSet;

public class PairSum {
    public static void pairs(int arr[] , int target){
        HashSet<Integer> nums = new HashSet<>();

        for(int num : arr){
            int sum = target - num;
            if(nums.contains(sum)){
                System.out.print("( " + sum + " , " + num + " ) ");
            }
            nums.add(num);
        }
    }
    public static void main(String[] args) {
        int arr[] = {80, 60, 10, 50, 30, 100, 0, 50};
        int target = 100;
        pairs(arr, target);
    }
}
