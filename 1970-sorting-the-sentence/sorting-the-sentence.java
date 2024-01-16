class Solution {
    public String sortSentence(String s) {
        Map<Integer,String> map = new HashMap<>();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                map.put((int)(s.charAt(i)-'0')-1,res.toString());
                res.setLength(0);
                i++;
            }else{
                res.append(s.charAt(i));
            }
        }
        for(int i=0; i<map.size()-1; i++) {
            res.append(map.get(i));
            res.append(" ");
        }
        res.append(map.get(map.size()-1));
        return res.toString();
    }
}