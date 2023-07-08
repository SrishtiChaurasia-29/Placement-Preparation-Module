class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(row -> row[0]));

        List<int[]> list = new ArrayList<>();
        if(intervals[1][0] >= intervals[0][0] && intervals[1][0] <= intervals[0][1]) {
            list.add(new int[] {intervals[0][0], Math.max(intervals[0][1], intervals[1][1])});
        } else {
            list.add(intervals[0]);
            list.add(intervals[1]);
        }

        for(int i = 2; i < intervals.length; i++) {
            int[] arr = list.get(list.size() - 1);
            if(intervals[i][0] >= arr[0] && intervals[i][0] <= arr[1]) {
                list.remove(list.size() - 1);
                list.add(new int[] {arr[0], Math.max(arr[1], intervals[i][1])});
            } else {
                list.add(intervals[i]);
            }
        }

        int[][] ans = new int[list.size()][2];
        for(int i = 0; i < ans.length; i++) ans[i] = list.get(i);
        return ans;
    }
}