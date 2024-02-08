class Solution {
    public int minAddToMakeValid(String s) {
        int res =0;
        int i =0;
        int left = 0;
        int right = 0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                left++;
            }else if(left>right){
                right++;
            }else res++;
            i++;
        }
        return res+(left-right);
    }
}