// find the frequency of each and every character in a string and sort it in descending order.
// Input: Engineer
// Output : e3n2g1i1r1

import java.util.*;

public class StringInt {
    public static String result(String s){
        HashMap<Character , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        PriorityQueue<Map.Entry<Character , Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        pq.addAll(hm.entrySet());
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character  ,Integer > entry = pq.poll();
            sb.append(entry.getKey()).append(entry.getValue());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "engineer";
        System.out.println(result(s));;
    }
}