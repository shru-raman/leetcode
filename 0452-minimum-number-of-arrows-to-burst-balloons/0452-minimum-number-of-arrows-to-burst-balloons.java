class Solution {
    public int findMinArrowShots(int[][] points) {
        int cnt = 1;
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int len = points.length;
        int prevEnd = points[0][1];

        for(int i=1;i<len;i++) {     
            int curStart = points[i][0];
            int curEnd = points[i][1];
            if(curStart <= prevEnd){
               continue;
            }
            cnt++;
            prevEnd = curEnd;
        }
        return cnt;
    }
}