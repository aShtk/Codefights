boolean isTreeSymmetric(Tree<Integer> t) {
    return t == null ? true : compare(t.left, t.right);
}

boolean compare(Tree<Integer> t, Tree<Integer> u){
    if(t == null && u == null) return true;
    if(t == null || u == null)
        return false; 
    if(!Integer.valueOf(t.value).equals(u.value))
        return false;
    return compare(t.left, u.right) && compare(t.right, u.left);
}
