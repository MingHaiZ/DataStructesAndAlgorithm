package leetCodeHot100;

import java.util.ArrayList;
import java.util.List;

/**
 * 这道题简单可能是因为题目里已经把推到公式告诉你了?
 * 五步法定位dp初始化第一个为1
 * 推到公式题目给出来了,就是n-1.n-1 + n-1.n
 */
public class Test118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
            }
            row.add(1);
            ans.add(row);
        }
        return ans;
    }
}
