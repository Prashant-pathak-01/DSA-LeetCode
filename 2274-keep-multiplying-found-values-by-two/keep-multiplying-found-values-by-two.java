class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        while(true){
            if(set.contains(original)) original*=2;
            else return original;
        }
    }
}