class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res = new StringBuilder();
        int k =0 ;
        for(int i=0; i<s.length(); i++){
            while(k<spaces.length && spaces[k]==i){
                res.append(" ");
                k++;
            }
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}