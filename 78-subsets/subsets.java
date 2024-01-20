class Solution {
    public void generateSubset(int nums[], List<List<Integer>> res, List<Integer> list, int indx){
        if(indx==nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[indx]);
        generateSubset(nums,res,list,indx+1);
        list.remove(list.size()-1);
        generateSubset(nums,res,list,indx+1);

        return;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        generateSubset(nums,res,new ArrayList<>(),0);
        return res;
    }
}