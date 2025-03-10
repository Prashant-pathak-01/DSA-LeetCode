class Solution {
    public void solve(Set<String> set, String tiles,String str){
        set.add(str);
        for(int i=0; i<tiles.length(); i++){
            solve(set,tiles.substring(0,i)+tiles.substring(i+1),str+tiles.charAt(i));
        }
    }
    public int numTilePossibilities(String tiles) {
        Set<String> set = new HashSet<>();
        solve(set,tiles,"");
        return set.size()-1;
    }
}