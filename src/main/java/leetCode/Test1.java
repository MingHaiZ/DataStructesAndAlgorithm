package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {

    }

    private int[] solution(int[] nums, int target) {
        Map<Integer, Integer> data = new HashMap<>();
        data.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (data.containsKey(target - nums[i])) {
                return new int[]{data.get(target - nums[i]), i};
            } else {
                data.put(nums[i], i);
            }
        }
        return null;
    }
}

