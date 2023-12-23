class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;  i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int i= 0;
        int arr[][] = new int[nums.length][2];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            arr[i][0] = entry.getKey(); 
            arr[i][1] = entry.getValue();
            i++;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(b[1],a[1]));
        int res[] = new int[k];
        for(int j=0;j<k; j++){
            res[j] = arr[j][0];
        }

        return res;
    }
}