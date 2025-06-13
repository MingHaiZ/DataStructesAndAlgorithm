package leetCode;

public class Test704 {

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            //这里一开始理解错误了使用right-left,这里应该是left + (区间length/2)
            mid = left+(right-left) / 2;
            int cur = nums[mid];
            if (cur == target) {
                return mid;
            } else if (cur > target) {
                right = mid - 1;
            } else if (cur < target) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
