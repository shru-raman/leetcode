class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        rec(candidates,0,target, new ArrayList<>(),0);
        return result;
    }
    
    public void rec(int[] arr, int cursum, int target, List<Integer> list, int start){
        if(cursum>target){
            return;
        }
        if(cursum==target){
            result.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=start;i<arr.length;i++){
            list.add(arr[i]);
            rec(arr, cursum + arr[i], target, list,i);
            list.remove(list.size()-1);
        }
    }
}