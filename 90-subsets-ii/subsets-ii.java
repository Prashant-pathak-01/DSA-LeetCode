class Solution {
    public void generate(List<List<Integer>> list, List<Integer> temp, int nums[], int i, boolean mark[]){
        list.add(new ArrayList<>(temp));
        for(int x=  i; x<nums.length; x++){
            if(x>i && nums[x]==nums[x-1]) continue;
            if(!mark[x]){
                mark[x] = true;
                temp.add(nums[x]);
                generate(list,temp,nums,x+1,mark);
                temp.remove(temp.size()-1);
                mark[x] = false;
            }
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        boolean arr[] = new boolean[nums.length];
        Arrays.sort(nums);
        generate(list,new ArrayList<>(),nums,0,arr);
        return list;
    }
}