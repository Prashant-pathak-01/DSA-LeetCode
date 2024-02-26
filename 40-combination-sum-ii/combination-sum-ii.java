class Solution {
    public void generate(int []arr, List<List<Integer>> list,List<Integer> temp, int i, int tar){
        if(tar<0) return;
        if(tar==0){
            list.add(new ArrayList<>(temp));
            return;
        }        
        if(i>=arr.length) return ;
        for(int x=i; x<arr.length; x++){
            temp.add(arr[x]);
            generate(arr,list,temp,x+1,tar-arr[x]);
            temp.remove(temp.size()-1);
            while(x<arr.length-1 && arr[x]==arr[x+1]) x++;
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        generate(candidates,list,new ArrayList<>(),0,target);
        return list;
    }
}