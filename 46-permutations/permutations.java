class Solution {
    public void generate(List<List<Integer>> list, List<Integer> temp, int[]arr){
        if(temp.size()==arr.length ) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(temp.contains(arr[i])) continue;
            temp.add(arr[i]);
            generate(list,temp,arr);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        generate(list,new ArrayList<>(),nums);
        return list;
    }
}