// WAP with 2 different logic, to find all duplicate numbers in an array. 

import java.util.*;

public class Duplicate {
    public static void duplicateNum1(int arr[]){
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
        }
        Set<Integer> keys = hm.keySet();
        for( int key : keys){
            if(hm.get(key) > 1){
                System.out.println(key);
            }
        }
    }
    public static void duplicateNum2(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, -2, 3, -2};
        // for logic 1 
        System.out.print("Logic 1 : ");
        duplicateNum1(arr);
        // for logic 2 
        System.out.print("Logic 2 : ");
        duplicateNum2(arr);
    }
}
