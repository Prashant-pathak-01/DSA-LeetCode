class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long res=0;
        int i=0; 
        int j=skill.length-1;
        int check = skill[i]+skill[j];
        while(i<j){
            if(skill[i]+skill[j]!=check) return -1;
            res+=(skill[i]*skill[j]);
            i++;
            j--;
        }
        return res;
    }
}