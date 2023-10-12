class Solution {
    public void moveZeroes(int[] nums) {
        
        int snowball = 0;
        int i = 0, len = nums.length;

        while(i<len) {
            if(nums[i]==0) { 
                snowball++; //1 //2
            } else if(snowball>0) {
               nums[i-snowball] = nums[i]; //nums[1-1] = 1 //nums[2-2] = 
               nums[i] = 0;//nums[1] = 0
            }
            i++;
        }
    }
}