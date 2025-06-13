package leetCode;

public class Test11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{2, 3, 4, 5, 18, 17, 6}));
    }

    private static int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
