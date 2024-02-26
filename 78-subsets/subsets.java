class Solution {
    public void generate(int arr[], List<List<Integer>> list,int in, List<Integer> temp,boolean[] mark){
        list.add(new ArrayList<>(temp));
        for(int i=in; i<arr.length; i++){
            if(!mark[i]){
                mark[i] = true;
                temp.add(arr[i]);
                generate(arr,list,i+1,temp,mark);
                temp.remove(temp.size()-1);
                mark[i] = false;
            }
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean arr[] = new boolean[nums.length];
        generate(nums,list,0,new ArrayList<>(),arr);
        return list;
    }
}