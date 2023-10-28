class Solution {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        Arrays.sort(intervals, (a,b)-> {
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        //1,4
        //2,3
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for(int i = 1;i<len;i++) {
            int last = list.size()-1;
            int prevStart = list.get(last)[0];
            int prevEnd = list.get(last)[1];
            int curStart = intervals[i][0];
            int curEnd = intervals[i][1];
            if(curStart <= prevEnd) {
                list.remove(last);
                list.add(new int[]{prevStart, Math.max(prevEnd, curEnd)});
            } else {
                list.add(intervals[i]);
            }
        }
        return list.stream().toArray(int[][] :: new);
    }
}