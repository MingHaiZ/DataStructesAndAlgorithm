package leetCode;

import java.util.Arrays;

public class Test238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    //    可以使用左右乘积列表来解决这个问题
    private static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
//        左乘积
        for (int i = 1; i < n; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }
//        右乘积,直接合并了
        int R = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * R;
            R *= nums[i];
        }
        return result;

    }
}
