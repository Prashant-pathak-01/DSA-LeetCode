class Solution {
    public boolean canBeValid(String s, String lock) {
        if(s.length()%2==1) return false;
        int open =0;
        boolean flag = true;
        for(int i=0; i<s.length(); i++){
            if(lock.charAt(i)=='0'){
                open++;
            }else{
                // can not verify if open is locked.
                if(s.charAt(i)==')') {
                    if(open==0){
                        flag = false;
                        break;
                    }
                    open--;
                }
                else open++;
            }
        }

        if(!flag) return false;
        open =0;
        for(int i=s.length()-1; i>=0; i--){
            if(lock.charAt(i)=='0'){
                open++;
            }else{
                // can not verify if open is locked.
                if(s.charAt(i)=='('){
                    if(open==0){
                        flag = false;
                        break;
                    }
                    open--;
                }
                else open++;
            }
        }
        return flag;
    }
}