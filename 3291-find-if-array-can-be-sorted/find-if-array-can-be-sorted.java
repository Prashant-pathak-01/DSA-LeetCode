class Solution {
    public boolean checkBits(int a, int b){
        String a1 = Integer.toBinaryString(a);
        String b1 = Integer.toBinaryString(b);
        int c1 = 0;
        int c2 = 0;
        for(int i=0; i<a1.length(); i++ ) if(a1.charAt(i)=='1') c1++;
        for(int i=0; i<b1.length(); i++ ) if(b1.charAt(i)=='1') c2++;
        return c1==c2;
    }
    public boolean sorted(int []nums){
        for(int i=0; i<nums.length-1; i++) if(nums[i]>nums[i+1]) return false;
        return true;
    }
    public boolean canSortArray(int[] nums) {
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]>nums[i]){
                boolean check = checkBits(nums[i-1],nums[i]);
                if(check){
                    int temp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = temp;
                    
                }else{
                    return false;
                }
                if(sorted(nums)) return true;
                i=0;
            }
        }
        return sorted(nums);
    }
}