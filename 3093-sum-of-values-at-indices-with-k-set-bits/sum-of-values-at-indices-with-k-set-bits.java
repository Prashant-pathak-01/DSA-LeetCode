class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int res= 0;
        for(int i=0; i<nums.size(); i++){
            String temp = Integer.toBinaryString(i);
            int count  =0;
            for(int j=0; j<temp.length(); j++){
                if(temp.charAt(j)=='1') count++;
            }
            if(count==k) res+=nums.get(i);
        }
        return res;
    }
}