class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffMap = new HashMap<>();
        //[-2,-1,0,1,2] , t=3
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];  
            if(diffMap.containsKey(diff)) {
                return new int[]{i, diffMap.get(diff)};
            }
            diffMap.put(nums[i], i); 
        }
        return new int[] {-1, -1};
    }
}