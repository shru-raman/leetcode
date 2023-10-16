class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.sort(potions);
        for(int i =0;i<spells.length;i++) {
            int count = 0;
            int start = 0;
            int end = potions.length-1;
            while(start<=end) {
                int mid = start + (end-start)/2;
                long mult = (long) spells[i] * potions[mid];
                if(mult<success){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
            count = count + potions.length - start;
            res[i] = count;
        }
        return res;
    }
}