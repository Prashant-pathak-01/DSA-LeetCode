class Solution {
    public int largestRectangleArea(int[] heights) {
        int res =0;
        int left[] = new int[heights.length];
        int right[] = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<heights.length; i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]) stack.pop();
            if(stack.isEmpty()) left[i] = -1;
            else left[i] = stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=heights.length-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]) stack.pop();
            if(stack.isEmpty()) right[i] = heights.length;
            else right[i] = stack.peek();
            stack.push(i);
        }
        for(int i=0; i<heights.length; i++){
            int count = right[i]-left[i]-1;
            res = Math.max(res,count*heights[i]);
        }
        return res;
    }
}