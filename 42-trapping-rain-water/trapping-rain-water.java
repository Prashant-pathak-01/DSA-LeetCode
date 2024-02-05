class Solution {
    public int trap(int[] height) {
        int leftMax= 0;
        int left = 0;
        int res =0;
        int rMax = 0;

        int right[] = new int[height.length];
        for(int i=height.length-1; i>=0; i--){
            right[i] = Math.max(rMax,height[i]);
            if(height[i]>rMax) rMax = height[i];
        }
        
        while(left<height.length){
            if(height[left]>=leftMax){
                leftMax = height[left];
            }else{
                if(right[left]>height[left]) {
                    res+=Math.min(leftMax,right[left])-height[left];
                }
            }
            left++;
        }
        return res;
    }
}