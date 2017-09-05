ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
    a = reverseList(a);
    b = reverseList(b);
    int sizea = getSize(a);
    int sizeb = getSize(b);
    if(sizea >= sizeb) return reverseList(addLists(a , b));
    
    return reverseList(addLists(b,a));
}

ListNode<Integer> addLists(ListNode<Integer> a, ListNode<Integer> b) {
    ListNode<Integer> head = a;
    ListNode<Integer> headb = b;
    int remainder = 0;
    int sum = 0;
    while(a != null){   
        sum = a.value + remainder;
        remainder = 0;
        if(b != null) sum += b.value;
        if(sum > 9999){
            a.value = sum % 10000;
            remainder = sum / 10000;
        }else{
            a.value = sum;
            remainder = 0;
        } 
        if(a.next == null && remainder > 0){
            a.next = new ListNode(remainder);
            break;
        }
        else a = a.next;
        if(b.next != null) b = b.next;
        else b.value = 0;
    }
    return head;
}

ListNode<Integer> reverseList(ListNode<Integer> l){
    ListNode<Integer> next = null;
    ListNode<Integer> prev = null;
    while(l != null){
        next = l.next;
        l.next = prev;
        prev = l;
        l = next;
    }
    return prev;
}

int getSize(ListNode<Integer> l){
    int count = 0;
    while(l != null){
        count++;
        l = l.next;
    }
    return count;
}
