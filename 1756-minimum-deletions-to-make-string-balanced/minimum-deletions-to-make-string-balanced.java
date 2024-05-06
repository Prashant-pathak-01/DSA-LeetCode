class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='b') stack.add('b');
            else if(!stack.isEmpty()) {
                stack.pop();
                count++;
            }
        }
        return count;
    }
}