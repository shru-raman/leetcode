class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      int len = nums1.length;
      int[][] pairs = new int[len][2];
      for(int i =0;i<len;i++){
        pairs[i] = new int[]{nums1[i], nums2[i]};
      }
       Arrays.sort(pairs, (a,b)->Integer.compare(b[1],a[1]));
       long sum = 0;
        for (int i = 0; i < k; ++i) {
            sum = sum + pairs[i][0];
            pq.add(pairs[i][0]);
        }
        long result = sum * pairs[k-1][1];
        for (int i = k; i < len; ++i) {
            sum = sum - pq.poll();
            sum = sum + pairs[i][0];
            result = Math.max(result, sum * pairs[i][1]);
            pq.add(pairs[i][0]);
        }
        return result;
    }
}

        //1,2
        //3,1
        //3,3
        //2,4

        //2,4
        //3,3
        //1,2
        
        //3,1
