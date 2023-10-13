class Solution {
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int start = 0, end = k;
        int cnt = 0;
        for(int i=0;i<k;i++) {
            if(isVowel(arr[i])) {
                cnt++;
            }
        }
        int max = cnt;
        for(int i=k;i<arr.length;i++) {
            if(isVowel(arr[i-k])) {
                cnt--;
            }
            if(isVowel(arr[i])) {
                cnt++;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }

    private boolean isVowel(char c) {
        return (c=='a'|| c=='e' || c=='i' || c=='o' || c=='u') ;
    }
}