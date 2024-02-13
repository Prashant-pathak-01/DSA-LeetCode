class Solution {
    public void getAllComb(int arr[], int target, int sum ,int i,List<List<Integer>>list, List<Integer> temp){
        if(sum==target){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target) return;
        if(i>=arr.length) return ;
        for(int x=i; x<arr.length; x++){
            temp.add(arr[x]);
            getAllComb(arr,target,sum+arr[x],x,list,temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        getAllComb(candidates,target,0,0,list,new ArrayList<>());
        return list;
    }
}