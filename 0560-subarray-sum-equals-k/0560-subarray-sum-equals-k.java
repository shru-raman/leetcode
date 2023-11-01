class Solution {
    public int subarraySum(int[] nums, int k) {
        //<-------> = x
        //<--->=k(x-k)
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum == k){
                count++;
            }
            int diff = sum - k;//1//0//-1
            if(map.containsKey(diff)){
                count = count + map.get(diff);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);//1=1//0=1
        }
        return count;
    } 
}