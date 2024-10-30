class Solution {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int l[] = new int[security.length];
        int r[] = new int[security.length];
        for(int i=1; i<security.length; i++){
            if(security[i]<=security[i-1]) l[i] = l[i-1]+1;
        }
        for(int i=security.length-2; i>=0; i--){
            if(security[i]<=security[i+1]) r[i] = r[i+1]+1;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<security.length; i++){
            if(l[i]>=time && r[i]>=time) list.add(i);
        }
        return list;
    }

}