class RandomizedSet {
    Map<Integer, Integer> map ;
    List<Integer> list ;
    java.util.Random rand = new java.util.Random();
    public RandomizedSet() {
         map = new HashMap<>();
         list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size()-1);//1-0, 2-1, 3-2, 4-3, 5-4
        return true;
    }
    //3
    public boolean remove(int val) {
       if(!map.containsKey(val)) {
           return false;
       }
       int listSize = list.size();//5
       int loc = map.get(val);  //2
       int lastElement = list.get(list.size()-1);//5
       list.set(loc, lastElement); //2-5
       map.put(lastElement, loc);
       map.remove(val);
       list.remove(listSize-1); //5-4
       return true;
    }
    
    public int getRandom() {
        int listSize = list.size(); //4
        return list.get(rand.nextInt(listSize));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */