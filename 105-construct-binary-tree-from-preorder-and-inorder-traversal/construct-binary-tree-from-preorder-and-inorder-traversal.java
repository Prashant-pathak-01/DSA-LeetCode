class Solution {
    public int check(int i, int n, int[] b, int tar){
        for(int x=i; x<=n; x++){
            if(b[x]==tar) return x;
        }
        return -1;
    }
    int x = 0;
    public TreeNode generate(int []a, int b[], int i, int n){
        if(i==n) return new TreeNode(a[x++]);
        if(i>n || x>=a.length) return null;
        TreeNode root = new TreeNode(a[x]);
        int check = check(i,n,b,a[x++]);
        root.left = generate(a,b,i,check-1);
        root.right = generate(a,b,check+1,n);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return generate(preorder,inorder,0,preorder.length-1);
    }
}