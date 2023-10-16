class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int num : piles) {
            max = Math.max(max, num);
        }
        int start = 1, end = max;
        while(start<=end){
            int mid = start + (end-start)/2;
            boolean canEat = canEatAll(piles, mid, h);
            if(canEat) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return start;
    }

    private boolean canEatAll(int[] piles, int k, int h) {
            long totalHours = 0;
            for(int i = 0;i<piles.length;i++){
                totalHours = totalHours + piles[i] / k;
                if(piles[i]%k>0){
                    totalHours++;
                }
            }
        return totalHours<=h;
    }
        
}
