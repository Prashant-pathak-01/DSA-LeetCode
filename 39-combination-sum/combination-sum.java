class Solution {
    public void generate(int arr[],List<List<Integer>> list, List<Integer> temp, int i, int tar){
        if(tar<0) return;
        if(tar==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(i>=arr.length) return;
        for(int in=i; in<arr.length; in++){
            temp.add(arr[in]);
            generate(arr,list,temp,in,tar-arr[in]);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        generate(candidates,list,new ArrayList<>(),0,target);
        return list;
    }
}