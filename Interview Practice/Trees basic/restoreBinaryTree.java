int preIndex = 0;
Tree<Integer> restoreBinaryTree(int[] inorder, int[] preorder) {
    return buildTree(inorder, preorder, 0, inorder.length - 1);
}

Tree<Integer> buildTree(int[] in, int[] pre, int inStrt, int inEnd) {
    if (inStrt > inEnd) 
        return null;
  
    Tree<Integer> tNode = new Tree(pre[preIndex++]);
  
    if (inStrt == inEnd)
        return tNode;
  
        
    int inIndex = search(in, inStrt, inEnd, tNode.value);
  
    tNode.left = buildTree(in, pre, inStrt, inIndex - 1);
    tNode.right = buildTree(in, pre, inIndex + 1, inEnd);
  
    return tNode;
}
  
int search(int arr[], int strt, int end, int value){
    int i;
    for (i = strt; i <= end; i++){
        if (arr[i] == value)
            return i;
        }
    return i;
}
