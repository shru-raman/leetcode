class Solution {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length+1];
        int[] fr = new int[digits.length];
        int r = digits.length;
        result[r] = digits[r-1]+1>9?0:digits[r-1]+1; //4
        int carry = result[r]==0?1:0;
        for(int i=digits.length-2;i>=0;i--){ //i=2
            if(digits[i]+carry>9){ //2+1
                result[i+1] = 0;
                carry = 1;
            } else {
                result[i+1] = digits[i]+carry; //4 //2+0
                carry = 0;
            }
        }
        if(carry==1) {
            result[0]=1;
        }
        if(result[0]!=0){
            return result;
        }
        int fridx = 0;
        while(fridx<digits.length){
            fr[fridx] = result[fridx+1];
            fridx++;    
        }
        return fr;
    }
}