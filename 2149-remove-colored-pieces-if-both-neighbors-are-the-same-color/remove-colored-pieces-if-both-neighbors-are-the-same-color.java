class Solution {
    public boolean winnerOfGame(String colors) {
        int aa = 0;
        int bb = 0;
        for(int i=0; i<colors.length(); i++){
            char a = colors.charAt(i);
            int count = 0;
            while( i<colors.length() && colors.charAt(i)==a){
                i++;
                count++;
            }
            i--;
            if(a=='A') aa+=Math.max(count-2,0);
            else bb+=Math.max(count-2,0);

        }
        System.out.println(aa+" "+bb);
        if(aa>bb) return true;
        else return false;
    }
}