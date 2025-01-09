class Solution {
    
    public List<String> removeComments(String[] source) {
        int line = -1;
        boolean block = false;
        List<String> list = new ArrayList<>();
        StringBuilder res = new StringBuilder();
        for(String str:source){
            for(int i=0; i<str.length(); i++){
                if(!block && i<str.length()-1 && str.charAt(i)=='/' && str.charAt(i+1)=='/'){
                    line = i;
                    break;
                }else if(!block && i<str.length()-1 && str.charAt(i)=='/' && str.charAt(i+1)=='*') {
                    block = true;
                    i++;
                    continue;
                }
                else if(block && i<str.length()-1 && str.charAt(i)=='*' && str.charAt(i+1)=='/') {
                    block = false;
                    i++;
                    continue;
                }
                if(!block){
                    res.append(str.charAt(i));
                }
            }
            if(res.toString().length()>0) {
                if(!block) {
                    list.add(res.toString());
                    res.setLength(0);
                }
            }
        }
        return list;
    }
}