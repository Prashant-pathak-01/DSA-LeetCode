class Solution {
    public int getLucky(String s, int k) {
        String str = "";
        for(int i=0; i<s.length(); i++) str = str+(int)(s.charAt(i)-'a'+1);
        int res=0 ;
        while(k-->0){
            res= 0;
            for(int i=0; i<str.length(); i++) res+=(int)(str.charAt(i)-'0');
            str = String.valueOf(res);
        }
        return res;
    }
}