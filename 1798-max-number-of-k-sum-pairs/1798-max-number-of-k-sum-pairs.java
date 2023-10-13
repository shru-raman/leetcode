class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int op = 0;
        for(int num : nums) {
            count.put(num, count.getOrDefault(num,0)+1);
        }

        for(int num : nums) {
            if(count.get(num)<1){
                continue;
            }
            int diff = k - num;
            if(count.containsKey(diff) && count.get(diff)>0 && diff!=num){
                op++;
                count.put(num, count.get(num)-1);
                count.put(diff,count.get(diff)-1);
            } else if(diff==num && count.containsKey(diff) && count.get(diff)>1) {
                op++;
                count.put(num, count.get(num)-2);
            }
        }
        return op;
    }
}