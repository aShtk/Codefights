boolean isListPalindrome(ListNode<Integer> l) {
    int count = 0;
    ListNode<Integer> aux = l;
    ListNode<Integer> tmp = null;
    //First reach all to get the half
    while (aux != null) {
        count++;
        aux = aux.next;
    }
    if (count < 2) return true;
    int m = count / 2;
    while (m > 0) {
        aux = l.next;
        l.next = tmp;
        tmp = l;
        l = aux;
        m--;
    }
    if (count % 2 == 1) {
        aux = aux.next;
    }
    
    
    while (aux != null && tmp != null) {
        System.out.println(aux.value + " "+ tmp.value);
        if (aux.value.intValue() != tmp.value.intValue()) return false;
        aux = aux.next;
        tmp = tmp.next;
    }
    return true;
}