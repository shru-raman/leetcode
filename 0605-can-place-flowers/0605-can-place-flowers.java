class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if(n==0){
            return true;
        }
        if(len==1 && n<=1 && flowerbed[0]==0){
            return true;
        }
        for(int i = 0; i< len ; i++) {
            if(n<=0) {
                return true;
            }
            if(i==0 && i+1<len && flowerbed[i]==0 && flowerbed[i+1]==0) {
                flowerbed[i] = 1;
                n--;
            } else if(i-1>=0 && i==len-1 && flowerbed[i]==0 && flowerbed[i-1]==0) {
                flowerbed[i] = 1;
                n--;
            } else if(i>0 && i<len-1 && flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n<=0;
    }
}