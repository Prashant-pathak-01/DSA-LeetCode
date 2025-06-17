class Solution {
    public int calculate(String str){
        return Integer.parseInt(str.substring(0,2))*60+Integer.parseInt(str.substring(3,5));
    }

    public int findMinDifference(List<String> timePoints) {
        int res = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>();
        for(String str:timePoints) list.add(calculate(str));
        Collections.sort(list);
        for(int i=0; i<list.size()-1; i++){
            res = Math.min(res,list.get(i+1)-list.get(i));
        }
        res = Math.min(res,1440+list.get(0)-list.get(list.size()-1));

        return res;
    }
}