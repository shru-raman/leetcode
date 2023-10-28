class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      int len = intervals.length;
      int delCount = 0;
      Arrays.sort(intervals,(a,b)-> {
          if(a[0]==b[0]){
              return a[1]-b[1];
          }
          return a[0]-b[0];
      });
      List<int[]> list = new ArrayList<>();
      list.add(intervals[0]);
      for(int i =1;i<len;i++){
          int last = list.size()-1;
          int prevStart = list.get(last)[0];
          int prevEnd = list.get(last)[1];
          int curStart = intervals[i][0];
          int curEnd = intervals[i][1];
          if(curStart<prevEnd && prevEnd <= curEnd) {
            delCount++;
          } else if(curStart<prevEnd && prevEnd > curEnd) {
            delCount++;
            list.remove(last);
            list.add(intervals[i]);
          } else {
              list.add(intervals[i]);
          }
      }
      return delCount;
    }
}