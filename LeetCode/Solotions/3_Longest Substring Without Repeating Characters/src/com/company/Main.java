package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        lengthOfLongestSubstring(args[0]);
    }

    // Code not mine...

    public static int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int longest=0, i = 0, j = 0, n = s.length();
        while (j < n) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            map.put(s.charAt(j), j + 1);
            longest = Math.max(longest, j - i + 1);
            j++;
        }
        System.out.println("a: " + longest);
        return longest;
    }
}
