class Solution {
    public int strStr(String haystack, String needle) {
        char[] narr = needle.toCharArray();
        char[] harr = haystack.toCharArray();
        int i=0, j=0;
        int n=0;
        while(j<haystack.length() && n < needle.length()) {
            if(narr[n]==harr[j]) {
                j++;
                n++;
            } else {
                n=0;
                j=i+1;
                i++;
            }
        }
        return n==needle.length()? i : -1;
    }
}