boolean sumOfTwo(int[] a, int[] b, int v) {
    Arrays.sort(b);
    for(int i = 0; i<a.length; i++)
        for(int j = 0; j<b.length; j++){
            if(a[i] + b[j] > v) break;
            if(a[i] + b[j] == v) return true;
        }
    
    return false;
}
