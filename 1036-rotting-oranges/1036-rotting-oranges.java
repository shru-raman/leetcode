class Solution {
    int[][] dirs = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public int orangesRotting(int[][] grid) {
        int minutes = 0;
        int m = grid.length;
        int n = grid[0].length;
        Queue<Node> que = new LinkedList<>();

        for(int r = 0;r<m;r++){
            for(int c = 0;c<n;c++){
                if(grid[r][c]==2) {
                    que.add(new Node(r,c,grid[r][c]));
                }
            }
        }

        while(!que.isEmpty()) {
            int size = que.size();
            while(size-- >0) {
                Node node = que.poll();
                for(int[] dir : dirs){
                    int i = node.r + dir[0];
                    int j = node.c + dir[1];
                    if(i>=0 && i<m && j>=0 && j<n && grid[i][j]==1){
                        grid[i][j] = 2;
                        que.add(new Node(i, j, grid[i][j]));
                    }
                }
            }
            minutes++;
        }
        for(int r = 0;r<m;r++){
            for(int c=0;c<n;c++) {
                if(grid[r][c]==1) {
                    return -1;
                }
            }
        }
        return minutes==0?0:minutes-1;
    }
    // 2 1 1
    // 0 1 1
    // 0 1 1
}

class Node {
    int r;
    int c;
    int val;
    public Node() {

    }

    public Node(int r, int c, int val) {
        this.r = r;
        this.c = c;
        this.val = val;
    }
}