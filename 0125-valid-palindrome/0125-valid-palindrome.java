class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.trim();
        if(s.length()<2) {
            return true;
        }
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length-1;
        int len = arr.length;
        while(i<j) {
            while(i<len && !(Character.isDigit(arr[i]) || Character.isLetter(arr[i]))) {
                i++;
            }
            while(j >=0 && !(Character.isDigit(arr[j]) || Character.isLetter(arr[j]))) {
                j--;
            }
            if(i>=len || j<0) {
                return true;
            }

            if(arr[i]==arr[j]){
                i++;j--;
            } else {
                return false;
            }
        }
        return true;
    }
}