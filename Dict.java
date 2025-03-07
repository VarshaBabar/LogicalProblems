// Generate a dictionary which stores the count of appearance of character in string 
// Input: aabbcdddededfg 
// Output= {“a”: 2, “b”: 2, “c”: 1, “d”:5, “e”:2, “f”:1, “g”:1} 

import java.util.HashMap;

public class Dict {
    public static void main(String[] args) {
        String str = "aabbcdddededfg";
        HashMap<Character , Integer > map = new HashMap<>();
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
    }
}
