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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list1;
        int x = 1;
        while(x!=a && curr1 != null){
            curr1=curr1.next;
            x++;
        }
        int y = 0;
        while(y != b && curr2!= null){
            curr2= curr2.next;
            y++;
        }
        ListNode tailList2 = list2;
        while(tailList2.next!= null){
            tailList2 = tailList2.next;
        }
        curr1.next = list2;
        tailList2.next= curr2.next;
        return list1;
    }
}