class Solution {
    public int compareVersion(String version1, String version2) {
        String[] vers1 = version1.split("\\.");
        String[] vers2 = version2.split("\\.");

        int minLen = Math.min(vers1.length, vers2.length);
        int i = 0, j = 0;
        while(i<vers1.length || j<vers2.length) {
            int v1 = i>=vers1.length?0:Integer.parseInt(vers1[i]);
            int v2 = j>=vers2.length?0:Integer.parseInt(vers2[j]);
            if(v1==v2){
                i++;j++;
                continue;
            }
            if(v1<v2){
                return -1;
            } else {
                return 1;
            }
        }
        return 0;
    }
}