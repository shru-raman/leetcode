class Solution {
    String result = "";
    public String strWithout3a3b(int a, int b) {
        int acnt = 0, bcnt = 0;
        int len = a+b;
        String str = "";
        StringBuilder sb = new StringBuilder();
        while(a+b > 0){
           String cur = sb.toString();
           if(cur.endsWith("aa")){
               sb.append("b");
                b--;
           } else if (cur.endsWith("bb")){
               sb.append("a");
               a--;
           } else if(a>b){
               sb.append("a");
               a--;
           } else {
               sb.append("b");
               b--;
           }
        }
        return sb.toString(); 
    }
}