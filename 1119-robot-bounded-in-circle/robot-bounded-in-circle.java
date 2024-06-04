class Solution {
    public boolean isRobotBounded(String instructions) {
        int x =0 ;
        int y = 0;
        int dir = 0;
        instructions = instructions;
        for(int i=0; i<instructions.length(); i++){
            if(instructions.charAt(i)=='L'){
                dir--;
                if(dir==-1) dir = 3;
            }
            else if(instructions.charAt(i)=='R') {
                dir++;
                if(dir==4) dir = 0;            
            }else{
                if(dir==0){
                    y++;
                }else if(dir==1){
                    x++;
                }else if(dir==2){
                    y--;
                }else{
                    x--;
                }
            }
        }
        return x==0 && y==0 || dir!=0;
    }
}