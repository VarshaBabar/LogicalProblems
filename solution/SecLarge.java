// WAP to find Second largest element in an array : arr[] = [12, 35, 1, 10, 34, 1, 35], without sorting, without using any built-in methods and without deleting duplicate elements. What will be the time complexity?
// time complexity : O(n) 
public class SecLarge{
    public static int secLargest(int arr[]){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
    public static void main(String[] args) {
        int arr[] = {12,35,1,10,34,1,35};
        System.out.println(secLargest(arr));
    }
}