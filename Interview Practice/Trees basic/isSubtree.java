boolean isSubtree(Tree<Integer> t1, Tree<Integer> t2) {
    if(t2 == null) return true;
    if(t1 == null) return false;
     
    if(compare(t1, t2)) return true;
    
    return isSubtree(t1.left, t2) || isSubtree(t1.right, t2);   
}

boolean compare(Tree<Integer> u, Tree<Integer> t){
    if(u == null && t == null) return true;
    if(u == null || t == null) return false; 
    if(!Integer.valueOf(t.value).equals(u.value))
        return false;
    return compare(t.left, u.left) && compare(t.right, u.right);
}
