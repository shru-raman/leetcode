class Solution {
    public boolean isPalindrome(int x) {
        int oldNum = x;
        if(x<0){
            return false;
        } 
        int newNum = 0;
        //123
        while(x > 0) {
            newNum = newNum*10 + (x%10); //3 //30+2=32 //320+1
            x = x/10; //12 //1 //0
        }
        return newNum == oldNum;
    }
}