/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode slow = head;
        HashSet<ListNode> set = new HashSet<>();
        
        while(slow!=null){
            if(set.contains(slow)){
                return slow;
            }
            set.add(slow);
            slow = slow.next;
        }
        return null;
    }
}