class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int num : nums) { //3 2 2 3
            if(num!=val) {
                nums[i] = num; //0=2 //1=2
                i++; //1 //2
            }
        }
        return i;
    }
}