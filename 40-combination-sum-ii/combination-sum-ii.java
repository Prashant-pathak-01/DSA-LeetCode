class Solution {
    public void generate(List<List<Integer>> list, List<Integer> temp, int []arr, int tar, int indx){
        if(tar==0){
            if(!list.contains(temp)) list.add(new ArrayList<>(temp));
            return;
        }
        if(indx>=arr.length) return;
        if(tar<0) return;
        for(int i=indx; i<arr.length; i++){
            temp.add(arr[i]);
            generate(list,temp,arr,tar-arr[i],i+1);
            temp.remove(temp.size()-1);
            for(int j= i; j<arr.length; j++){
                if(i<arr.length-1 && arr[i]==arr[i+1]) i++;
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        generate(list,new ArrayList<>(), candidates,target,0);
        return list;
    }
}