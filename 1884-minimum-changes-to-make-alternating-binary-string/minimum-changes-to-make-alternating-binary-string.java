class Solution {
    public int minOperations(String s) {
        int a1 = 0;
        int a2 = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                if(i%2==1) a1++;
                else a2++;
            }else{
                if(i%2==0) a1++;
                else a2++;
            }
        }
        return Math.min(a1,a2);
    }
}