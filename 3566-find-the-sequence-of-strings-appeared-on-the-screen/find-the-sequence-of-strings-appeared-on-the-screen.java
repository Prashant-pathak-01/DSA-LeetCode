class Solution {
    public List<String> stringSequence(String target) {
        List<String> list = new ArrayList<>();
        String res = "";
        for(int i=0; i<target.length(); i++){
              res = res+'a';
              while(target.charAt(i)!=res.charAt(i)){
                list.add(res);
                char last = res.charAt(res.length()-1);
                res = res.substring(0,res.length()-1)+(char)(last+1);
              }
              list.add(res);
        }
        return list;
    }
}