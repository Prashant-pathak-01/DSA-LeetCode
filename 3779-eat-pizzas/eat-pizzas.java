class Solution {
    public long maxWeight(int[] pizzas) {
        int oddC = (pizzas.length+4)/8;
        int evenC = pizzas.length/8;
        Arrays.sort(pizzas);
        long res =0;
        int i = pizzas.length-1;
        while(oddC>0){
            oddC--; 
            res+=pizzas[i--];
        }
        i--;
        while(evenC>0){
            evenC--; 
            res+=pizzas[i--];
            i--;
        }
        return res;
    }
}