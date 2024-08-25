class Solution {
    public boolean isValid(int a, int b){
        if(a==b) return true;
        String str = String.valueOf(b);
        for(int i=0; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++){
                String newStr = str.substring(0,i)+str.charAt(j)+str.substring(i+1,j)+str.charAt(i)+str.substring(j+1);
                if(Integer.parseInt(newStr)==a) return true;
            }
        }
        return false;
    }
    public int countPairs(int[] nums) {
        int res= 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(isValid(nums[i],nums[j]) || isValid(nums[j],nums[i])) {
                    res++;
                }
            }
        }
        return res;
    }
}