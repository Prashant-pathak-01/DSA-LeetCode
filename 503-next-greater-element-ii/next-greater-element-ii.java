class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i]) stack.pop();
            if(stack.isEmpty()) res[i] = Integer.MAX_VALUE;
            else res[i] = stack.peek();
            stack.push(nums[i]);
        }
        for(int i=nums.length-1; i>=0; i--){
            if(res[i]==Integer.MAX_VALUE){
                while(!stack.isEmpty() && stack.peek()<=nums[i]) stack.pop();
                if(!stack.isEmpty()) res[i] = stack.peek();
                stack.push(nums[i]);
            }
        }
        for(int i=0; i<res.length; i++) if(res[i]==Integer.MAX_VALUE) res[i] =-1;
        return res;
    }
}