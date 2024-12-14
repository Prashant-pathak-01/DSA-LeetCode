class Solution {
    public int solve(String str, Set<String> set){
        int res = 0;
        for(int i=1; i<=str.length(); i++){
            if(!set.contains(str.substring(0,i))){
                set.add(str.substring(0,i));
                res=Math.max(res,1+solve(str.substring(i),set));
                set.remove(str.substring(0,i));
            }
        }
        return res;
    }
    public int maxUniqueSplit(String s) {
        Set<String> set = new HashSet<>();
        return solve(s,set);
    }
}