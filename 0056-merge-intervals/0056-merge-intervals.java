class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res = new ArrayList<>();
        int index=0;
        while(index<intervals.length)
        {
            int start = intervals[index][0];
            int end = intervals[index][1];

            while(index<intervals.length-1 && end>=intervals[index+1][0])
            {
                end = Math.max(end,intervals[index+1][1]);
                index+=1;
            }
            int newEnd = end;
            res.add(new int[]{start,newEnd});
            index+=1;
        }
        index = 0;
        int[][] ans = new int[res.size()][2];
        for(int[] arr:res)
        {
            ans[index++]=arr;
        }
        return ans;
    }
}