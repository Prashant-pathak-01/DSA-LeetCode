class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>=0 && map.containsKey(arr[i]*2)) {
                map.put(arr[i]*2,map.get(arr[i]*2)-1);
                if(map.get(arr[i]*2)==0) map.remove(arr[i]*2);
            }else if(arr[i]<0 && arr[i]%2==0 && map.containsKey(arr[i]/2))
            {
                map.put(arr[i]/2,map.get(arr[i]/2)-1);
                if(map.get(arr[i]/2)==0) map.remove(arr[i]/2);
            }
            else{
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }
        return map.size()==0;
    }
}