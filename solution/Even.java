// . Code to find even numbers in a list 

import java.util.ArrayList;

public class Even {
    public static ArrayList<Integer> evenNum(int arr[]){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2 == 0){
                res.add(arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {6,52,46,47,25,36,15};
        System.out.println(evenNum(nums));
    }
}
