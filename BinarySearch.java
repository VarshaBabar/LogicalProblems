// Write a function that implements the binary search algorithm using iteration.
public class BinarySearch {
    public static int search(int arr[] , int key){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left + (right-left) /2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,8,12,16,23,38,56,72,91};
        int key = 72;
        System.out.println(search(arr, key));
    }
}
