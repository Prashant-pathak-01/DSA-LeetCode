class Solution {
    public int minimumOperations(TreeNode root) {
        int res= 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size(); 
            int x =0;
            int a[] = new int[size];
            int b[] = new int[size];
            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                a[x] = temp.val;
                b[x] = temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                x++;
            }
            Arrays.sort(a);

            for(int i=0; i<size; i++){
                if(a[i]!=b[i]) {
                    res++;
                    for(int j=i+1; j<size; j++){
                        if(b[j]==a[i]){
                            b[j] = b[i];
                            break;
                        }
                    }
                }
            }

        }
        return res;
    }
}