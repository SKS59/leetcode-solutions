// class Solution {
//     public int[][] merge(int[][] intervals) {
//         int n = intervals.length;
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//         List<int[]> mergedIntervals = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             int start = intervals[i][0];
//             int end = intervals[i][1];
//             if (!mergedIntervals.isEmpty() && end <= mergedIntervals.get(mergedIntervals.size() - 1)[1]) {
//                 continue;
//             }
//             for (int j = i + 1; j < n; j++) {
//                 if (intervals[j][0] <= end) {
//                     end = Math.max(end, intervals[j][1]);
//                 } else {
//                     break;
//                 }
//             }
//             mergedIntervals.add(new int[] { start, end });
//         }
//         return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
//     }
// }

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        for (int[] interval : intervals)
            if (ans.isEmpty() || ans.get(ans.size() - 1)[1] < interval[0]) {
                ans.add(interval);
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1],
                        interval[1]);
            }
        return ans.toArray(int[][]::new);
    }
}
