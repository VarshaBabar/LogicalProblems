// 4, 5, 6, 7, 8, 9, 11, 12, 13, 6, 7, 8, 9
// These two are linkedList, Find point of common element?

import java.util.HashSet;
import java.util.LinkedList;

public class LLcommonEle {
    public static int commonEle(LinkedList<Integer> list1 , LinkedList<Integer> list2){
        HashSet<Integer> elements = new HashSet<>();
        for(int key : list1){
            elements.add(key);
        }
        for(int key : list2){
            if(elements.contains(key)){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedList<Integer>list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        // for list1 
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        // for list2 
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);

        System.out.println("Point of common element : " + commonEle(list1, list2));
    }
}