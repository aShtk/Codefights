ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
    if(l.next == null) return l;
    ListNode<Integer> mainhead = null;
    ListNode<Integer> currhead = l;
    ListNode<Integer> nextheadtolink = null;
    ListNode<Integer> firstheadtolink = null;
    ListNode<Integer> prevcurrhead = null;
    ListNode<Integer> prevcurrnext = null;
    int index = 1;
    while(l != null){
        if(index == k){
            mainhead = l;
        }
        if(index%k == 0){
            prevcurrnext = prevcurrhead;
            prevcurrhead = currhead;
            firstheadtolink = l;
            nextheadtolink = l.next;
            l.next = null;
            currhead = reverse(currhead);
            if(prevcurrnext != null) prevcurrnext.next = firstheadtolink;
            currhead = nextheadtolink;
            prevcurrhead.next = nextheadtolink;
            l = nextheadtolink;
        }
        else l = l.next;
        index++;
    }
    
   return mainhead;
}

ListNode<Integer> reverse(ListNode<Integer> l){
    ListNode<Integer> next = null;
    ListNode<Integer> prev = null;
    ListNode<Integer> curr = l;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;    
    }
    return prev;
}
