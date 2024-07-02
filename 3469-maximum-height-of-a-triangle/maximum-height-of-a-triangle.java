class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int count =0;
        boolean flag = false;
        int a =red;
        int b = blue;
        while(true){
            if(flag){
                if(red>count){
                    count++;
                    red-=count;
                }else break;
            }else{
                if(blue>count){
                    count++;
                    blue-=count;
                }else break;
            }
            flag = !flag;
        }
        int res = count;  
        red = a;
        blue = b;
        count = 0;
        flag = true;  

        while(true){
            if(flag){
                if(red>count){
                    count++;
                    red-=count;
                }else break;
            }else{
                if(blue>count){
                    count++;
                    blue-=count;
                }else break;
            }
            flag = !flag;
        } 
        return Math.max(res,count); 
    }
}