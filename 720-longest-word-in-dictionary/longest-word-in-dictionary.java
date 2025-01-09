class Solution {
    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>();
        int maxLen = 0;
        String res = "";
        for(String str:words) set.add(str);
        for(String str:set){
            boolean flag = true;
            for(int i=0; i<str.length(); i++){
                if(!set.contains(str.substring(0,i+1))) flag = false;
            }
            if(flag && str.length()>=maxLen) {
                // System.out.println(str+" "+res);
                if(maxLen==str.length()){
                    res = res.compareTo(str)>0?str:res;
                }else{
                    res = str;
                    maxLen = str.length();
                }
            }
        }
        return res;
    }
}