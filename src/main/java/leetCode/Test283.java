package leetCode;

public class Test283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{1,0,3,2,0,4,5});
    }

    private static void moveZeroes(int[] nums) {
        int slowPointer = 0;
        int fastPointer = 0;
        while (fastPointer < nums.length) {
            if (nums[fastPointer] != 0) {
                int temp = nums[slowPointer];
                nums[slowPointer] = nums[fastPointer];
                nums[fastPointer] = temp;
                slowPointer++;
            }
            fastPointer++;
        }
    }
}
