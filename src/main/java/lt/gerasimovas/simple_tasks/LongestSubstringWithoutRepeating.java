package lt.gerasimovas.simple_tasks;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("abcabc")); //3
//        System.out.println(lengthOfLongestSubstring("bbbbb")); //1
//        System.out.println(lengthOfLongestSubstring("pwwkew")); //3
//        System.out.println(lengthOfLongestSubstring(" ")); //1
        System.out.println(lengthOfLongestSubstring("jbpnbwwd")); //4

    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()){
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }

        int max = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();
        for (int j = 0; j < s.length(); j++) {
            for (int i = j; i < s.length(); i++) {
                if (!set.contains(s.charAt(i))){
                    max++;
                    set.add(s.charAt(i));
                } else {
                    if (max > result){
                        result = max;
                    }
                    max = 0;
                    set.clear();
                    break;
                }
            }
        }

        return result;
    }
}
