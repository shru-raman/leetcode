class Solution {
    int[] vis ;
    Map<Integer, Set<Integer>> map = new HashMap<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        vis = new int[numCourses];
        //construct directed graph
        for(int[] preq : prerequisites) {
            Set<Integer> set = map.getOrDefault(preq[0], new HashSet<>());
            set.add(preq[1]);
            map.put(preq[0], set);
        }

        //call dfs from each node
        for(int i = 0;i<numCourses;i++) {
            boolean val = dfs(i);
            if(val==false){
                return false;
            }    
        }
        return true;
    }

    public boolean dfs(int i) {
        if(vis[i]==1) {
            return false;
        }
        if(vis[i]==2){
            return true;
        }
        vis[i] = 1;
        Set<Integer> set = map.getOrDefault(i, new HashSet<>());
        for(int num : set){
            boolean val = dfs(num);
            if(val == false){
                return false;
            }
        }
        vis[i]= 2;
        return true;
    }
}