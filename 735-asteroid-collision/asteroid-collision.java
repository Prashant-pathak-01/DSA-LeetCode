class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(!stack.isEmpty() && stack.peek()>0 && arr[i]<0){
                int x = arr[i]*(-1);
                if(x>stack.peek()){
                    while(!stack.isEmpty() && x>stack.peek() && stack.peek()>0){
                        stack.pop();
                    }
                    if(!stack.isEmpty() && stack.peek()>x) continue;
                    if(!stack.isEmpty() && stack.peek()==x){
                        stack.pop();
                        continue;
                    }
                }else if(x==stack.peek()){
                    stack.pop();
                    continue;
                } else continue;
            }
            stack.add(arr[i]);
        }
        int res[] = new int[stack.size()];
        int k = stack.size()-1;
        while(!stack.isEmpty()){
            res[k] = stack.pop();
            k--;
        }

        return res;
    }
}