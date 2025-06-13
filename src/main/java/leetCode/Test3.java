package leetCode;

import java.util.HashSet;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    private static int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0, right = 0;
        while (right < charArray.length) {
            while (set.contains(charArray[right])) {
                set.remove(charArray[left]);
                left++;
            }
            set.add(charArray[right]);
            max = Math.max(max, set.size());
            right++;
        }
        return max;
    }
}
