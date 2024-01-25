class Solution {
    public String shortestPalindrome(String s) {
        if(s.length()<=1) return s;
        String newS = s+'*'+new StringBuilder(s).reverse().toString();
        int []pos = new int[newS.length()];
        for(int i=1; i<newS.length(); i++){
            int pre = pos[i-1];
            while(pre>0 && newS.charAt(pre)!=newS.charAt(i)) pre = pos[pre-1];
            pos[i] = pre+((newS.charAt(pre)==newS.charAt(i))?1:0);
        }
        return new StringBuilder(s.substring(pos[pos.length-1])).reverse().toString()+s;
    }
}