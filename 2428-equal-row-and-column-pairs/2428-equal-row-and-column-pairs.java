class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid[0].length;
        int result = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i =0 ;i<n;i++) {
            String key = Arrays.toString(grid[i]);
            map.put(key, map.getOrDefault(key,0)+1);
        }
        for(int i = 0;i<n;i++) {
            int[] col = new int[n];
            for(int j = 0;j<n;j++) {
                col[j] = grid[j][i];
            }
            String str = Arrays.toString(col);
            if(map.containsKey(str)){
                result = result + map.get(str);
            }
        }
        return result;
    }
}