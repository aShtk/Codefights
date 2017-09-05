ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {

    if (null == l || n == 0) return l;
    
    ListNode fast = l, slow = l;
    
    while(n > 0 && fast != null) {
        fast = fast.next;
        n--;
    }
    
    if (n >= 0 && fast == null) return l;
    
    while (fast.next != null) {
        slow = slow.next;
        fast = fast.next;
    }
    
    ListNode newHead = slow.next;
    slow.next = null;
    fast.next = l;
    
    return newHead;
}