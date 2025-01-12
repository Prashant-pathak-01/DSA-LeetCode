class Solution {
    public boolean canBeValid(String s, String lock) {
        if(s.length()%2==1) return false;
        int locked = 0;
        int unlocked =0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || lock.charAt(i)=='0'){
                if(lock.charAt(i)=='0') unlocked++;
                else locked++;
            }else{
                if(locked>0) locked--;
                else if(unlocked>0) unlocked--;
                else return false;
            }
        }
        locked = 0;
        unlocked =0;
        for(int i=s.length()-1; i>=0;  i--){
            if(s.charAt(i)==')' || lock.charAt(i)=='0'){
                if(lock.charAt(i)=='0') unlocked++;
                else locked++;
            }else{
                if(locked>0) locked--;
                else if(unlocked>0) unlocked--;
                else return false;
            }
        }
        return true;
    }
}