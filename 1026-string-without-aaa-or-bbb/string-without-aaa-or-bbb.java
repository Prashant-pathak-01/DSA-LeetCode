class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder res = new StringBuilder();
        int temp = Math.min(a,b);
        if(a>b){
            for(int i=0; i<temp; i++){
                if(a!=b){
                    res.append("aa");
                    a-=2;
                    res.append("b");
                    b--;
                }else{
                    res.append("ab");
                    a--;
                    b--;
                }
            }
                if(a!=0) for(int i=0; i<a; i++) res.append("a");

        }else{
            for(int i=0; i<temp; i++){
                if(a!=b){
                    res.append("bb");
                    b-=2;
                    res.append("a");
                    a--;
                }else{
                    res.append("ba");
                    a--;
                    b--;
                }
            }
            if(b!=0) for(int i=0; i<b; i++) res.append("b");
        }
        return res.toString();
    }
}