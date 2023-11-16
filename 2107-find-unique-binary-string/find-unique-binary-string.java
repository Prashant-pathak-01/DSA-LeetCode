class Solution {
    public String allCombinations(String str, int n, Set<String> set){
        if(str.length()==n){
            if(!set.contains(str)) return str;
            else return "";
        }
        String zero = allCombinations(str+"0",n,set);
        if(!zero.isEmpty()) return zero;
        return allCombinations(str+"1",n,set);
    }
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) set.add(nums[i]);
        return allCombinations("",nums[0].length(),set);
    }
}