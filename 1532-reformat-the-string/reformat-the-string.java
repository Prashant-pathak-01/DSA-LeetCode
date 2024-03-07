class Solution {
    public String reformat(String s) {
        List<Character> chr = new ArrayList<>();
        List<Character> num = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) num.add(s.charAt(i));
            else chr.add(s.charAt(i));
        }

        if(chr.size()!=num.size() && chr.size()!=num.size()+1 && chr.size()+1!=num.size()) return "";

        String res = "";

        if(chr.size()>num.size()){
            for(int i=0; i<num.size(); i++){
                res = res+chr.get(i)+num.get(i);
            }
            res = res+chr.get(chr.size()-1);
        }else{
            for(int i=0; i<chr.size(); i++){
                res = res+num.get(i)+chr.get(i);
            }
            if(chr.size()!=num.size()) res = res+num.get(num.size()-1);
        }

        return res;

    }
}