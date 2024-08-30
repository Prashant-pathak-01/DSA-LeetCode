class Solution {
    Map<Integer,Integer> map;
    int x = 0;
    public TreeNode generate(int []a, int b[], int i, int n){
        if(i==n) return new TreeNode(a[x++]);
        if(i>n || x>=a.length) return null;
        TreeNode root = new TreeNode(a[x]);
        int check = map.getOrDefault(a[x++],-1);
        root.left = generate(a,b,i,check-1);
        root.right = generate(a,b,check+1,n);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for(int i=0; i<inorder.length; i++) map.put(inorder[i],i);
        return generate(preorder,inorder,0,preorder.length-1);
    }
}