class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[s.length()];
        q.add(0);
        int max = 0;
        while(!q.isEmpty()){
            int temp = q.poll();
            if(temp==s.length()-1) return true;
            for(int i=Math.max(temp+minJump,max); i<=Math.min(temp+maxJump,s.length()-1); i++){
                if(!visited[i] && s.charAt(i)=='0') {
                    q.add(i);
                    visited[i] = true;
                }
                max =i;
            }
        }
        return false;
    }
}