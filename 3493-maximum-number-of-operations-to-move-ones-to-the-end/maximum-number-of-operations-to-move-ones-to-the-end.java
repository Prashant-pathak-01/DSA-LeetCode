class Solution {
    public int maxOperations(String s) {
        int res= 0;
        int count =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1') {
                count++;
            }else{
                res+=count;
                while(i<s.length() && s.charAt(i)=='0') i++;
                i--;
            }
            
        }
        return res;
    }
}