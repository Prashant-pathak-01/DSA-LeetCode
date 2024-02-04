class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        Map<Character,Integer> tMap = new HashMap<>();
        for(int i=0; i<t.length(); i++) tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        Map<Character,Integer> sMap = new HashMap<>();
        int l = 0;
        int res = Integer.MAX_VALUE;
        int count = 0;
        String str = "";
        int need = t.length();
        for(int r=0; r<s.length(); r++){
            sMap.put(s.charAt(r),sMap.getOrDefault(s.charAt(r),0)+1); 
            if(tMap.containsKey(s.charAt(r)) && sMap.get(s.charAt(r))<=tMap.get(s.charAt(r))) count++;
            while(count==need){
                if(res>r-l+1){
                    res = r-l+1;
                    str = s.substring(l,r+1);
                }
                sMap.put(s.charAt(l),sMap.get(s.charAt(l))-1);
                if(tMap.containsKey(s.charAt(l)) && sMap.get(s.charAt(l))<tMap.get(s.charAt(l))) count--;
                l++;
            }
        }
        return str;
    }
}