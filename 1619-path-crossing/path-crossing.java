class Solution {
    public boolean isPathCrossing(String path) {
        Set<Pair<Integer,Integer>> set= new HashSet<>();
        set.add(new Pair(0,0));
        int x = 0;
        int y = 0;
        for(int i=0; i<path.length(); i++){
            if(path.charAt(i)=='N'){
                y++;
            }else if(path.charAt(i)=='E'){
                x++;
            }else if(path.charAt(i)=='W'){
                x--;
            }else y--;
            if(set.contains(new Pair(x,y))) return true;
            set.add(new Pair(x,y));
        }
        return false;
    }
}