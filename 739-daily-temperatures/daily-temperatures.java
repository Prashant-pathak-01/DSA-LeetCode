class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> hello = new Stack<>();
        int arr[] = new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++) {
                while( !hello.isEmpty() && temperatures[hello.peek()]<temperatures[i]) {
                    int prev = hello.pop();
                    arr[prev] = i-prev;

                }
                hello.push(i);
        }
        return arr;
    }
}