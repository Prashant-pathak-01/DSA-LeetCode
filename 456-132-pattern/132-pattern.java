class Solution {
    public boolean find132pattern(int[] nums) {
        int b = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(int i=nums.length-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<nums[i]) b = stack.pop();
            stack.push(nums[i]);
            if(nums[i]<b) return true;
        }
        return false;
    }
}