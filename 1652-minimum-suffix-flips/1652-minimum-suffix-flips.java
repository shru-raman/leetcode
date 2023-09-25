class Solution {
    public int minFlips(String target) {
       int count = 0;
       char[] tarr = target.toCharArray();
       int len =  tarr.length;
       char status = '0';
       for(int i=0;i<len;i++){
           if(status!=tarr[i]){
              status = status == '0'? '1' : '0';
              count++;
           }
       }
        return count;
    }
}