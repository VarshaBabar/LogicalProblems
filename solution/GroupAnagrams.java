// Given an array of strings, group the anagrams together. You can return the answer in any order.
// Input: str = ["eat","tea","tan","ate","nat","bat"]
//  Output: [["bat"],["nat","tan"],["ate","eat","tea"

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars); // Sort the string to form a key
            String sortedStr = new String(chars);

            map.putIfAbsent(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
