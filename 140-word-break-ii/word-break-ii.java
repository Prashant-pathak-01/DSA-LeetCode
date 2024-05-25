class Solution {
    public void solve(String str, int indx, List<String> dict, String res, List<String> resList){
        if(indx==str.length()){
            resList.add(res.substring(0,res.length()-1));
            return;
        }
        for(int i=0; i<dict.size(); i++){
            if(indx+dict.get(i).length()<=str.length() && str.substring(indx,indx+dict.get(i).length()).equals(dict.get(i))) solve(str,indx+dict.get(i).length(),dict,res+dict.get(i)+" ",resList);
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> list = new ArrayList<>();
        solve(s,0,wordDict,"",list);
        return list;
    }
}