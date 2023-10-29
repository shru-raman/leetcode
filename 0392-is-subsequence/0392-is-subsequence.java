class Solution {
    public boolean isSubsequence(String s, String t) {
       int slen = s.length(), tlen = t.length();
        if(slen==0){
            return true;
        }
        if(slen>tlen) {
            return false;
        }
        int si = 0, ti = 0;
        while(si<slen && ti < tlen) {
            if(s.charAt(si)==t.charAt(ti)) {
                si++;
            }
            ti++;
        }
        return si==slen;
    }
}