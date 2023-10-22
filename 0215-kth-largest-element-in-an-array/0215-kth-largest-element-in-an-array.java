class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a-b);
        //1 2 2 3 3 4 5 5 6
        for(int num : nums){
            pq.add(num);
            if(pq.size()>k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
}