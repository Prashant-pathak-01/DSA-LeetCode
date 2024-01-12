class Solution {
    public String maximumNumber(String num, int[] change) {
        StringBuilder res = new StringBuilder();
        int i =0;
        boolean changes = false;
        for(i=0; i<num.length(); i++){
            if(change[num.charAt(i)-'0']>=(int)(num.charAt(i)-'0')){
            while(i<num.length() && change[num.charAt(i)-'0']>=(int)(num.charAt(i)-'0')){
                if(change[num.charAt(i)-'0']!=(int)(num.charAt(i)-'0')) changes = true;
                res.append(change[num.charAt(i)-'0']);
                i++;
            }
            if(changes) break;
            i--;
            
        }else res.append(num.charAt(i));
        }
        
        for(; i<num.length(); i++){
            res.append(num.charAt(i));
        }
        return res.toString();
    }
}