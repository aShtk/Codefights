int[] quickSort(int[] a, int l, int r) {

  if (l >= r) {
    return a;
  }

  int x = a[l];
  int i = l;
  int j = r;

  while (i <= j) {
    while (a[i] < x) {
      i++;
    }
    while (a[j] > x) {
      j--;
    }
    if (i <= j) {
      int t = a[i];
      a[i] = a[j];
      a[j] = t;
      i++;
      j--;
    }
  }
  
  if(l < i - 1)
      quickSort(a, l, i - 1);
  if(i < r)
      quickSort(a, i, r);
  
  return a;
}
