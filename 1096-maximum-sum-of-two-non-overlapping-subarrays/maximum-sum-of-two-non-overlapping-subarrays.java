class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int prefixSum[] = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        int res = 0;
        for(int i=0; i<nums.length-firstLen+1; i++){
            for(int j=0; j<nums.length-secondLen+1; j++){
                if((i<j && i+firstLen-1<j) || (j<i && j+secondLen-1<i)){
                    int s1 = prefixSum[i+firstLen-1]-prefixSum[i]+nums[i];
                    int s2 = prefixSum[j+secondLen-1]-prefixSum[j]+nums[j];
                    res = Math.max(res,s1+s2);
                }
            }
        }
        return res;
    }
}