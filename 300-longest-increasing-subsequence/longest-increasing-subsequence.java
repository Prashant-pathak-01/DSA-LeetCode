class Solution {
    public int getIndex(List<Integer> list, int tar){
        int start =0;
        int end = list.size()-1;
        int mid = 0;
        while(start<=end){
            mid = (start+end)/2;
            if(tar==list.get(mid)) return mid;
            else if(tar<list.get(mid)) end = mid-1;
            else start = mid+1;
        }
        return start;

    }
    public int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(nums[i]>list.get(list.size()-1)) list.add(nums[i]);
            else{
                int index = getIndex(list,nums[i]);
                list.set(index,nums[i]);
            }
        }
        return list.size();
    }
}