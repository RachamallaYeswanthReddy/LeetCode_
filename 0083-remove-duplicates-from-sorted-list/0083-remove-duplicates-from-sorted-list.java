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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode curr = head;
        ListNode fast = head;
        while(fast!=null){
            if(curr.val!=fast.val){
                curr.next=fast;
                curr = curr.next;
            }
            fast = fast.next;
        }
        curr.next=  null;
        return head;
    }
}