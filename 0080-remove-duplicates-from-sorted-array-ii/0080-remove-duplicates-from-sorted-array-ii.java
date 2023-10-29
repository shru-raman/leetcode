class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return 2;
        }
        int pos = 2;
        for(int i = 2;i<nums.length ;i++){
            if(nums[i]>nums[pos-2]){
                nums[pos++]=nums[i];
        } 
    }
      
    //     int i = 0;
    // for (int n : nums)
    //     if (i < 2 || n > nums[i-2])
    //         nums[i++] = n;
    // return i;
        return pos;
    }
}