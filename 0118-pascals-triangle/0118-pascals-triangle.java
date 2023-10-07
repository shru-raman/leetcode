class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));
        if(numRows==1) {
            return result;
        }
        result.add(List.of(1,1));
        for(int i=2;i<numRows;i++) {
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for(int j=1;j<i;j++){
                cur.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            cur.add(1);
            result.add(cur);
        }
        return result;
    }
}