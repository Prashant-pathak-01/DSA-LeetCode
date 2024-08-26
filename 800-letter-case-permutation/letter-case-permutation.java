class Solution {
    List<String> list ;
    public void solve(String s, String res, int i){
        if(i>=s.length()) {
            list.add(res);
            return;
        }
        if(!Character.isDigit(s.charAt(i))){
            solve(s,res+Character.toLowerCase(s.charAt(i)),i+1);
            solve(s,res+Character.toUpperCase(s.charAt(i)),i+1);
        }else{
            solve(s,res+s.charAt(i),i+1);
        }
    }
    public List<String> letterCasePermutation(String s) {
        list =  new ArrayList<>();
        solve(s,"",0);
        return list;
    }
}