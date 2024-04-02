class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.size(); i++){
            map.put(nums.get(i),map.getOrDefault(nums.get(i),0)+1);
        }
        int max = -1;
        for(int i=0; i<nums.size(); i++){
            if((map.get(nums.get(i))*2)>nums.size()+1) {
                max = nums.get(i);
                break;
                }
        }
        int count1 = 0;
        int count2 =0 ;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i)==max) count1++;
            else count2++;
            if(count1>count2) return i;
        }
        return -1;



    }
}