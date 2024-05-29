class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while(Math.pow(x,i)<=bound){
            int temp = 1;
            int pow = (int)Math.pow(x,i);
            int num = pow+temp;
            while(num<=bound){
                if(num<=bound && !res.contains(num)) res.add(num);
                temp*=y;
                num = pow+temp;
                if(y==1) break;
            }
            i++;
            if(x==1) break;
        }
        return res;
    }
}