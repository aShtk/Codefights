int kthLargestInBST(Tree<Integer> t, int k) {
  return search(t, k, 1) - 300000;
}

int search(Tree<Integer> t, int k, int num){
  if(t == null) return num;
  int val = search(t.left, k, num);
  if(val == k) return 300000 + t.value;
  if(val > 100000) return val;
  val = search(t.right, k, val + 1);
  return val;
}