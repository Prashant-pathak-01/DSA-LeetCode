class Solution {
    public void generate(String s,List<String> list, int i, int count, String res ){
        if(count>4) return;
        if(i==s.length()){
            if(count==4 && isValid(res.substring(1))) list.add(res.substring(1));
            return;
        }
        for(int x=i; x<Math.min(i+3,s.length()); x++){
            generate(s,list,x+1,count+1,res+"."+s.substring(i,x+1));
        }
    }
    public boolean isValid(String res){
        String arr[] = res.split("\\.");
        for(String x:arr){
            if(x.length()==1) continue;
            if(x.charAt(0)!='0' && Long.parseLong(x)>=0 && Long.parseLong(x)<=255 ){
                continue;
            }else return false;
        }
        return true;
    }
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        generate(s,list,0,0,"");
        return list;
    }
}