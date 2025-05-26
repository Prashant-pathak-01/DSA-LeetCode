class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        Set<String> set = new HashSet<>();
        for(int i[]:queens){
            set.add(i[0]+" "+i[1]);
        }
        List<List<Integer>> list = new ArrayList<>();
        boolean l = true;
        boolean r = true;
        boolean t = true;
        boolean b = true;
        boolean lt = true;
        boolean lb = true;
        boolean rt = true;
        boolean rb = true;

        for(int i=1; i<8; i++){
            if(rb && set.contains((king[0]+i)+" "+(king[1]+i))) {
                List<Integer> temp = new ArrayList<>();
                temp.add(king[0]+i);
                temp.add(king[1]+i);
                list.add(temp);
                rb = false;
            }
            if(lt && set.contains((king[0]-i)+" "+(king[1]-i))) {
                List<Integer> temp = new ArrayList<>();
                temp.add(king[0]-i);
                temp.add(king[1]-i);
                list.add(temp);
                lt = false;
            }
            if(rt && set.contains((king[0]-i)+" "+(king[1]+i))) {
                List<Integer> temp = new ArrayList<>();
                temp.add(king[0]-i);
                temp.add(king[1]+i);
                list.add(temp);
                rt = false;
            }
            if(lb && set.contains((king[0]+i)+" "+(king[1]-i))) {
                List<Integer> temp = new ArrayList<>();
                temp.add(king[0]+i);
                temp.add(king[1]-i);
                list.add(temp);
                lb = false;
            }

            if(b && set.contains((king[0]+i)+" "+king[1])) {
                List<Integer> temp = new ArrayList<>();
                temp.add(king[0]+i);
                temp.add(king[1]);
                list.add(temp);
                b = false;
            }

            if(t && set.contains((king[0]-i)+" "+king[1])) {
                List<Integer> temp = new ArrayList<>();
                temp.add(king[0]-i);
                temp.add(king[1]);
                list.add(temp);
                t = false;
            }

            if(r && set.contains(king[0]+" "+(king[1]+i))) {
                List<Integer> temp = new ArrayList<>();
                temp.add(king[0]);
                temp.add(king[1]+i);
                list.add(temp);
                r = false;
            }

            if(l && set.contains(king[0]+" "+(king[1]-i))) {
                List<Integer> temp = new ArrayList<>();
                temp.add(king[0]);
                temp.add(king[1]-i);
                list.add(temp);
                l = false;
            }
        }
        return list;
    }
}