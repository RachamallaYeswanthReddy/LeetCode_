/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        
        ListNode mid = midNode(head);
        ListNode right = mid.next;
        
        //remove connection 
        mid.next= null;
        
        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(right);
        
        return merge(leftSorted,rightSorted);
        
    }
    
    static ListNode midNode(ListNode head){
        if(head == null) return head;
        
        ListNode slow=head,fast = head;
        
        while(fast.next!=null && fast.next.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    static ListNode merge(ListNode l1, ListNode l2){
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        
        while(l1!= null && l2!=null){
            if(l1.val<=l2.val){
                curr.next=l1;
                l1 = l1.next;
            }else{
                curr.next= l2;
                l2= l2.next;
            }
            curr = curr.next;
        }
        if(l1!=null){
            curr.next = l1;
        }else{
            curr.next = l2;
        }
        return dummy.next;
    }
}