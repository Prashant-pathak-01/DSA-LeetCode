class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> set = new HashSet<>();
        for(int i=0; i<obstacles.length; i++){
            set.add(obstacles[i][0]+" "+obstacles[i][1]);
        }
        int x= 0;
        int y = 0;
        int dir = 0;
        int res = 0;
        for(int i=0; i<commands.length; i++){
                if(commands[i]==-2){
                    if(dir==0) dir=3;
                    else dir--;
                }else if(commands[i]==-1){
                    dir++;
                    dir%=4;
                }else{
                    for(int p=0; p<commands[i]; p++){
                        if(dir==0){
                            if(set.contains(x+" "+(y+1))) break;
                            y++;
                        }else if(dir==1){
                            if(set.contains((x+1)+" "+y)) break;
                            x++;
                        }else if(dir==2){
                            if(set.contains(x+" "+(y-1))) break;
                            y--;
                        }else{
                            if(set.contains((x-1)+" "+y)) break;
                            x--;
                        }
                    }
                    res = Math.max(res,(x*x)+(y*y));
                }
        }
        return res;
    }
}