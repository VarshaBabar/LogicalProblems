// 10. Find the intersection of two lists 
// E.g List1=[1, 2, 3, 4, 5] List2=[3, 4, 6] Intersection=[3, 4] 

import java.util.*;
public class Intersection {
    public static int[] fun(int list1[] , int list2[]){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0 ; i < list1.length ; i++){
            for(int j = 0 ; j < list2.length ; j++){
                if(list1[i] == list2[j]){
                    res.add(list1[i]);
                }
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String arg[]){
        int list1[] = {1,2,3,4,5};
        int list2[] = {3,4,6};
        int res[] = fun(list1, list2);
        System.out.println(Arrays.toString(res));
    }
}
