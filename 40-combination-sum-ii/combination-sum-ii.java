class Solution {
    public void generate(int []arr, List<List<Integer>> list,List<Integer> temp, int i, int tar){
        if(tar<0) return;
        if(tar==0){
            list.add(new ArrayList<>(temp));
            return;
        }        
        if(i>=arr.length) return ;
        for(int x=i; x<arr.length; x++){
            if(x>i && arr[x]==arr[x-1]) continue;
            temp.add(arr[x]);
            generate(arr,list,temp,x+1,tar-arr[x]);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        generate(candidates,list,new ArrayList<>(),0,target);
        return list;
    }
}