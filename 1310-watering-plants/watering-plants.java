class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int res =0;
        int init = capacity;
        for(int i=0; i<plants.length; i++){
            if(init>=plants[i]){
                init-=plants[i];
                res++;
            }else{
                res++;
                res+=(i*2);
                init = capacity-plants[i];
            }
        }
        return res;
    }
}