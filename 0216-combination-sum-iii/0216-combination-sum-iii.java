class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        rec(arr, 0, n, new ArrayList<>(), k, 0);
        return result;
    }

    private void rec(int[] arr, int sum, int target, List<Integer> list, int k, int start) {
        if(sum==target && list.size()==k){
            result.add(new ArrayList<>(list));
            return;
        }
        if(list.size()>=k){
            return;
        }
        if(sum>target){
            return;
        }
        for(int i = start;i<arr.length;i++){
            list.add(arr[i]);
            rec(arr, sum + arr[i],target, list, k, i+1);
            list.remove(list.size()-1);
        }
    }
}