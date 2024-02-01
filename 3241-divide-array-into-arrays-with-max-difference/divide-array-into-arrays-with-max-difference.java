class Solution {
    public int[][] divideArray(int[] nums, int k) {
        if(nums.length%3!=0) return new int[0][0];
        int res[][] = new int[nums.length/3][3];
        Arrays.sort(nums);
        int x = 0;
        for(int i=0; i<nums.length/3; i++){
            for(int j=0; j<3; j++){
                res[i][j] = nums[x++];
            }
            if(res[i][2]-res[i][0]>k) return new int[0][0];;
        }
        return res;
    }
}