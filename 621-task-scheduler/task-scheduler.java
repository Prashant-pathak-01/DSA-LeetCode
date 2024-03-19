class Solution {
    public int leastInterval(char[] tasks, int n) {
        int count[] = new int[26];
        for(int i=0; i<tasks.length; i++) count[tasks[i]-'A']++;
        Arrays.sort(count);
        int max = count[count.length-1]-1;
        int res = max*n;
        for(int i=24; i>=0 && count[i]>0; i--){
            res-=Math.min(max,count[i]);
        }
        return res>0?res+tasks.length:tasks.length;

    }
}