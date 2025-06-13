package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test56 {
    public static void main(String[] args) {
        merge(new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}});
    }

    private static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[][]{};
        }
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (res.getLast()[1] >= intervals[i][0]) {
                res.getLast()[1] = Math.max(res.getLast()[1], intervals[i][1]);
            } else {
                res.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        return res.toArray(new int[res.size()][]);
    }

}
