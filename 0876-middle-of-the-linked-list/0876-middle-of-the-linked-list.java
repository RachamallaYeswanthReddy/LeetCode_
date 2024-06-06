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
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        int size = 0;
        ListNode temp= head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int half = (size%2==0)? (size/2)+1: (size+1)/2;
        System.out.println(half);
        ListNode mid = head;
        for(int i=1;i<half;i++){
            mid = mid.next;
        }
        return mid;
    }
}