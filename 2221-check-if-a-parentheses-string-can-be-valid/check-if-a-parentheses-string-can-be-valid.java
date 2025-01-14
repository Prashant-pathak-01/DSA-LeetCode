class Solution {
    public boolean canBeValid(String s, String lock) {
        if(s.length()%2==1) return false;
        Stack<Integer> gift = new Stack<>();
        Stack<Integer> open = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(lock.charAt(i)=='0') gift.push(i);
            else{
                if(s.charAt(i)=='(') open.add(i);
                else if(!open.isEmpty()){
                    open.pop();
                }else if(!gift.isEmpty()) {
                    gift.pop();
                }else return false;
            }
        }
        while(!open.isEmpty()){
            if(gift.isEmpty()) return false;
            if(gift.peek()<open.peek()) return false;
            gift.pop();
            open.pop();
        }
        return gift.size()%2==0;
    }
}