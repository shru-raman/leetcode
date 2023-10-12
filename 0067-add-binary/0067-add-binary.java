class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char arr[] = a.toCharArray();
        char barr[] = b.toCharArray();
        int i = arr.length-1;
        int j = barr.length-1;
        int carry = 0;
        while(i>=0 || j>=0) {
            int sum = 0;
            if(i>=0) sum = sum + arr[i] - '0'; //0+1=1 
            if(j>=0)sum = sum + barr [j] - '0'; //1+0 = 1
            sum = sum + carry; //1 + 0 =1
            sb.append(sum%2); //1
            carry = sum/2; //0 
            i--;j--;
        }
    
        if(carry!=0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}