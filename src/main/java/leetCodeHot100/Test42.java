package leetCodeHot100;

/*
接雨水
 */
public class Test42 {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    private static int trap(int[] height) {
        int[] ph = new int[height.length];
        int[] sh = new int[height.length];
        int currentHigh = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > currentHigh) {
                currentHigh = height[i];
            }
            ph[i] = currentHigh;
        }
        currentHigh = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            if (height[i] > currentHigh) {
                currentHigh = height[i];
            }
            sh[i] = currentHigh;
        }
        int result = 0;
        for (int i = 0; i < sh.length - 1; i++) {
            result += Math.min(ph[i], sh[i]) - height[i];
        }
        return result;
    }

    private static int trapTwoPointer(int[] height) {
        int n = height.length;
        int lp = 0, rp = n - 1, result = 0;
        int lpm = 0, rpm = 0;
        while (lp <= rp) {
            lpm = Math.max(lpm, height[lp]);
            rpm = Math.max(rpm, height[rp]);
            if (lpm < rpm) {
                result += lpm - height[lp];
                lp++;
            } else {
                result += rpm - height[rp];
                rp--;
            }
        }
        return result;
    }

}
