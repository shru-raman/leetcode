class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
  //      String sub = "";
        int result = 0;
        int l1 = text1.length();
        int l2 = text2.length();
        if(l1==0 || l2==0){
            return result;
        }
        int dp[][] = new int[l1+1][l2+1];
        for(int i = 0;i<=l1;i++){
            dp[i][0]=0;
         //   System.out.println("dp["+i+"][0] : 0");
        }
        for(int i = 0;i<=l2;i++){
            dp[0][i]=0;
      //  System.out.println("dp[0]["+i+"] : 0");

        }
        char[] text1arr = text1.toCharArray();
        char[] text2arr = text2.toCharArray();
        
        for(int i = 1; i<=l1;i++){
            for(int j = 1;j<=l2;j++){
                if(text1arr[i-1]==text2arr[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                 //   sub = sub+String.valueOf(text1.charAt(i-1));
                //    System.out.println("So far matched : "+sub);
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[l1][l2];
    }
}