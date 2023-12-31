class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        List<Integer> list = new ArrayList<>();
        int i=0; int j = cheeseSlices;
        while(i<=cheeseSlices){
            if((i*4)+(j*2)==tomatoSlices) {
                list.add(i);
                list.add(j);
                break;
            }else if((j*4)+(i*2)==tomatoSlices){
                list.add(j);
                list.add(i);
                break;
            }else{
                i++;
                j--;
            }
        }
        return list;
    }
}