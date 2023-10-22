class SmallestInfiniteSet {

    PriorityQueue<Integer> pq ;
    Set<Integer> set;
    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        set = new HashSet<>();
        int num = 1;
        while(num<=1000){
            pq.add(num);
            set.add(num);
            num++;
        }
    }
    
    public int popSmallest() {
        set.remove(pq.peek());
        return pq.poll();
    }
    
    public void addBack(int num) {
        if(!set.contains(num)){
            set.add(num);
            pq.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */