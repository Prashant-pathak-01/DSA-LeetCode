class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while(Math.pow(x,i)<=bound){
            int numA = (int)Math.pow(x,i);
            int numB = 1;
            int num = numA+numB;
            while(num<=bound){
                if(num<=bound && !res.contains(num)) res.add(num);
                numB*=y;
                num = numA+numB;
                if(y==1) break;
            }
            i++;
            if(x==1) break;
        }
        return res;
    }
}