boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
    if(t == null)
        return s == 0 ? true : false;
 
    if(t.right != null && t.left != null)
         return hasPathWithGivenSum(t.right, s - t.value) || hasPathWithGivenSum(t.left, s - t.value);
    if(t.left != null)
        return hasPathWithGivenSum(t.left, s - t.value);
   
    return hasPathWithGivenSum(t.right, s - t.value);
}
