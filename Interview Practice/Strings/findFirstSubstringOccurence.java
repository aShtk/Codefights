int findFirstSubstringOccurrence(String s, String t) {
    int i = 0, j = 0;
    
    int ptrnLen = t.length();
    int txtLen = s.length();
 
    int[] b = preProcessPattern(t);
 
    while (i < txtLen) {
        while (j >= 0 && s.charAt(i) != t.charAt(j)) {
            j = b[j];
        }
        i++;
        j++;
 
        if (j == ptrnLen) {
            return i - ptrnLen;
        }
    }
    
    return -1;
}

int[] preProcessPattern(String ptrn) {
    int i = 0, j = -1;
    int ptrnLen = ptrn.length();
    int[] b = new int[ptrnLen + 1];
 
    b[i] = j;
    while (i < ptrnLen) {            
            while (j >= 0 && ptrn.charAt(i) != ptrn.charAt(j)) {
                j = b[j];
        }
        i++;
        j++;
        b[i] = j;
    }
    return b;
}