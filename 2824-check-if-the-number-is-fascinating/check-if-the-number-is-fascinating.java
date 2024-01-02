class Solution {
    public boolean isFascinating(int n) {
        Set<Integer> set = new HashSet<>();
        int temp = n;
        while(n>0){
            int r = n%10;
            n/=10;
            if(set.contains(r) || r==0) return false;
            set.add(r);
        }
        n = temp*2;
        while(n>0){
            int r = n%10;
            n/=10;
            if(set.contains(r) || r==0) return false;
            set.add(r);
        }
        n = temp*3;
        while(n>0){
            int r = n%10;
            n/=10;
            if(set.contains(r) || r==0) return false;
            set.add(r);
        }
        return set.size()==9;
    }
}