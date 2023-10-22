class Solution {
    boolean[][] vis ;
    int[][] dirs = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        vis = new boolean[m][n];
        int islands = 0;
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++) {
                if(vis[i][j]==false && grid[i][j]=='1') {
                    dfs(grid, m, n, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void dfs(char[][] grid, int m, int n, int i, int j) {
        if(i<0 || i>=m || j<0 || j>=n || vis[i][j] || grid[i][j]=='0') {
            return;
        }
        vis[i][j] = true;
        for(int[] dir : dirs) {
            dfs(grid, m, n, i+dir[0], j+dir[1]);
        }
    }
}