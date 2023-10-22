class Solution {
    boolean[] vis;
    public int findCircleNum(int[][] isConnected) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();

        int r = isConnected.length;
        int c = isConnected[0].length;
        vis = new boolean[r];
        //00 01 02
        //10 11 12
        //20 21 22
        for(int i = 0;i<r;i++) {
            for(int j=0;j<c;j++) {
                if(isConnected[i][j]==1){
                    Set<Integer> dir1 = graph.getOrDefault(i, new HashSet<>());
                    dir1.add(j);
                    Set<Integer> dir2 = graph.getOrDefault(j, new HashSet<>());
                    dir2.add(i);
                    graph.put(i, dir1);
                    graph.put(j, dir2);
                }
            }
        }
        int province = 0;
        for(int i = 0 ;i<r;i++) {
            if(vis[i]==false){
                dfs(graph, i);
                province++;
            }
        }
        return province;
    }        

    private void dfs(Map<Integer, Set<Integer>> graph, int key) {
        Set<Integer> values = graph.get(key); //Ovals = [0,1,2] //1vals=[0,1,2]
        if(vis[key]) {
            return ;
        }
        vis[key] = true; //vis[0] = true;vis[1] = true, vis[2] = true
        for(int val : values) {
            dfs(graph, val);
        }
    }
}