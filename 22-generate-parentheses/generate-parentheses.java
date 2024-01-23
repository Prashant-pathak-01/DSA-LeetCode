class Solution {
    public void generate(int i, int j, int n, String s, List<String> res){
        if(s.length()==n*2){
            res.add(s);
            return;
        }
        if(i<n) generate(i+1,j,n,s+"(",res);
        if(j<i) generate(i,j+1,n,s+")",res);
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>(); 
        generate(0,0,n,"",res);
        return res;
    }
}