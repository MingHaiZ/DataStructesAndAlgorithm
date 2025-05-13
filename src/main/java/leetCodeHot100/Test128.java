package leetCodeHot100;

import java.util.*;

public class Test128 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}));
    }

    private static int longestConsecutive(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
        }

        int longestResult = 0;

        for (int integer : integers) {
            if (!integers.contains(integer - 1)) {
                int currentNum = integer;
                int currentResult = 1;
                while (integers.contains(currentNum + 1)) {
                    currentNum++;
                    currentResult++;
                }
                longestResult = Math.max(longestResult, currentResult);
            }
        }
        return longestResult;
    }
}
