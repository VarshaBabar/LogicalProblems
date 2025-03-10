// WAP to find missing elements from the array? 
import java.util.*;
public class MissingEle {
    public static int missing(int arr[]){
        Arrays.sort(arr);
        int count = 1 ;

        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] != count){
                return count;
            }
            count++;
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {5,1,4,3};
        System.out.println(missing(arr));
    }
}