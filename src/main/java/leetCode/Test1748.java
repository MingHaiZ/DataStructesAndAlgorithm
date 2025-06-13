package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Test1748 {
    private int sumOfUnique(int[] nums) {
        Map<Integer, Integer> records = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!records.containsKey(nums[i])) {
                records.put(nums[i], 1);
            } else {
                int cur = records.get(nums[i]) + 1;
                records.put(nums[i], cur);
            }
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : records.entrySet()) {
            if (entry.getValue() == 1) {
                result += entry.getKey();
            }
        }
        return result;
    }
}
