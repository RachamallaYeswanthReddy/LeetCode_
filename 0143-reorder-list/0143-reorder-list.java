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
    public void reorderList(ListNode head) {
        
        // find the middle element
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Now slow pointer is the Mid point 
    
        // Reverse the second part of the Linkedlist
        
        ListNode temp,curr = slow.next;
        ListNode prev = null;
        slow.next = null; // dividing two linked list
        while(curr!= null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        // Now merge the two linkedlists
        ListNode first = head , second = prev,tmp;
        while (second != null) {
            tmp = first.next;
            first.next = second;
            second = second.next;
            first.next.next = tmp;
            first = tmp;
        }
        
    }
}