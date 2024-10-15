class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        int res =0;
        for(int i:set){
            if(!set.contains(i-1)){
                int count =1;
                while(set.contains(i+1)){
                    count++;
                    i++;
                }
                res = Math.max(res,count);
            }
        }
        return res;
    }
}