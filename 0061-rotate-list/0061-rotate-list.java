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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0){
            return head;
        }
        if(head == null || head.next== null){
            return head;
        }
        ListNode last = head;
        ListNode curr = head;
        int len = 1;
        while(last.next!=null){
            len++;
            last=last.next;
        }
        if(k>=len){
            k = k%len;
        }
        System.out.print(k);
        for(int i=0;i<len-k-1;i++){
            curr=curr.next;
        }
        // curr = last.next;
        // curr.next =a head;
        // head = curr;
        // last.next = null;
        
        last.next = head;
        head = curr.next;
        curr.next = null;

        return head;
    }
}