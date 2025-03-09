class Solution {
    public boolean canChange(String start, String target) {
        int l =0;
        int r =0 ;
        for(int i=0; i<target.length(); i++){
            if(start.charAt(i)=='L') l++;
            else if(start.charAt(i)=='R') r++;
            if(target.charAt(i)=='L') l--;
            else if(target.charAt(i)=='R') r--;
        }
        if(l!=0 || r!=0) return false;
        for(int i=0; i<target.length(); i++){
            if(start.charAt(i)=='R') {
                r++;
            }
            if(target.charAt(i)=='L'){
                l++;
            }else if(target.charAt(i)=='R'){
                l=0;
                if(r<=0) return false;
                r--;
            }
            if(start.charAt(i)=='L'){
                r =0;
                if(l>0) l--;
                else return false;
            }
        }
        return true;
    }
}