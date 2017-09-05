ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    
    if(l == null) return l;
    while(l.value == k){
        if(l.next == null) return null;
        l = l.next;
    }
    if(l.next == null){
        if(l.value != k) return l;
        else return null;
    }
 
    ListNode<Integer> prev = l;
    ListNode<Integer> temp = l.next;
    
    while (temp.next != null){
        if(temp.value == k){
            temp = temp.next;
            prev.next = temp;
        } 
        else{
            prev = temp;
            temp = temp.next;
        }
    } 
    
    if(temp.value == k) prev.next = null;
 
    return l;
}
