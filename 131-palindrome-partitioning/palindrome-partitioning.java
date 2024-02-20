class Solution {
    public boolean isPal(String str){
        int i=0; 
        int j = str.length()-1;
        while(i<j)
            if(str.charAt(i++)!=str.charAt(j--)) return false;
        return true;
    }
    public void generateSoln(String s, List<List<String>> list, List<String> temp){
        if(s.length()==0){
            list.add(new ArrayList(temp));
            return;
        }
        for(int x=0; x<s.length(); x++){
            if(isPal(s.substring(0,1+x))){
                temp.add(s.substring(0,x+1));
                generateSoln(s.substring(x+1),list,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        generateSoln(s,list,new ArrayList<>());
        return list;
    }
}