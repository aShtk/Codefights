ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
    if(l1 == null && l2 == null) return null;
    if(l1 == null) return l2;
    if(l2 == null) return l1;
    
    ListNode<Integer> head = l1.value <= l2.value ? l1 : l2;
    ListNode<Integer> next = null;
    ListNode<Integer> res = head;
    
    while(l1 != null || l2 != null){
        if(l1 == null && l2 == null) break;
        if(l2 == null){
            next = l1;
            l1 = l1.next;
        } 
        else if(l1 == null){
            next = l2;
            l2 = l2.next;
        }
        else if(l1.value <= l2.value){
            next = l1;
            l1 = l1.next;
        } else {
            next = l2;
            l2 = l2.next;
        }
        res.next = next;
        res = res.next;
    }
    return head;
}
         
      