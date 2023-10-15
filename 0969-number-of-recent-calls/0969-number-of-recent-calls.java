class RecentCounter {
    Queue<Integer> que; 
    public RecentCounter() {
        que = new LinkedList<>();
    }
    
    public int ping(int t) {
        que.offer(t);
        while(!que.isEmpty() && que.peek().intValue() < t-3000){
            que.poll();
        }
        return que.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */