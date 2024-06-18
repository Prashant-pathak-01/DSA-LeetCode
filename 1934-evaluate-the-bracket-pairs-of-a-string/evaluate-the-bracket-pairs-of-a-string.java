class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();
        for(int i=0; i<knowledge.size(); i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder temp = new StringBuilder();
        StringBuilder res = new StringBuilder();
        boolean open = false;
        for(int i=0; i<s.length(); i++){
            if(open){
                if(s.charAt(i)!='(' && s.charAt(i)!=')'){
                    temp.append(s.charAt(i));
                } 
            }else{
                if(s.charAt(i)!='(' && s.charAt(i)!=')'){
                    res.append(s.charAt(i));
                } 
            }
            if(s.charAt(i)=='(') open = true;
            else if(s.charAt(i)==')') {
                open = false;
                res.append(map.getOrDefault(temp.toString(),"?"));
                temp.setLength(0);
            }
        }
        return res.toString();
    }
}