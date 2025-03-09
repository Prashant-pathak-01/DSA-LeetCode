class Solution {
    public boolean canTransform(String start, String result) {
        if(start.length()!=result.length()) return false;
        int r =0;
        int l =0;
        for(int i=0; i<start.length(); i++){
            if(start.charAt(i)=='R') r++;
            else if(start.charAt(i)=='L') l++;
            if(result.charAt(i)=='R') r--;
            else if(result.charAt(i)=='L') l--;
        }
        if(l!=0 || r!=0) return false;

        for(int i=0; i<start.length(); i++){
            if(start.charAt(i)=='R'){
                r++;
            }
            if(result.charAt(i)=='L'){
                l++;
            }else if(result.charAt(i)=='R'){
                l =0;
                if(r<=0) return false;
                r--;
            }
            if(start.charAt(i)=='L'){
                if(l<=0) return false;
                r =0;
                l--;
            }
        }
        return true;
    }
}