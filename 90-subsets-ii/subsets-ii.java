class Solution {
    public void generateSub(int nums[], List<List<Integer>>list, int i,List<Integer> temp){
        if(!list.contains(temp)){
                list.add(new ArrayList<>(temp));
        }
        if(i>=nums.length) return;   
            temp.add(nums[i]);
            generateSub(nums,list,i+1,temp);
            temp.remove(temp.size()-1);
            generateSub(nums,list,i+1,temp);

        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        generateSub(nums,list,0,new ArrayList<>());
        return list;
    }
}