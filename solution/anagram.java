// Logic for anagram program with its time complexity. (for large strings).
// time complexity = O(n) 
import java.util.*;

public class anagram {
    public static boolean isAnagram(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        for(int i = 0 ;i < s2.length() ; i++){
            char ch = s2.charAt(i);
            if(hm.containsKey(ch)){
                if(hm.get(ch) == 1){
                    hm.remove(ch);
                }else{
                    hm.put(ch, hm.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return hm.isEmpty();
    }
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        System.out.println(isAnagram(s1 , s2));;
    }
}