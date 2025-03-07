// Write a function to find the kth largest item in an array. 
public class Largest {
    public static int largestNum(int arr[]){
        int large = Integer.MIN_VALUE;
        for(int i = 0;i< arr.length ;i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int arr[] = {2,7,101,15};
        System.out.println(largestNum(arr));;
    }
}
