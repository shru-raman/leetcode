class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr ){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());
        while(!pq.isEmpty() && k-- >0){
            int count = pq.poll();
            //k=1
            //1
            //3
            if(--count > 0){
                pq.add(count);
            }
        }
        return pq.size();
    }
}