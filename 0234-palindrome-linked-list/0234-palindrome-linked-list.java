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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode slow =head;
        boolean palindrome= true;
        while(slow!= null){
            st.push(slow.val);
            slow = slow.next;
        }
        while(head!= null){
            int top = st.pop();
            if(top == head.val){
                palindrome = true;
            }
            else{
                palindrome = false;
                break;
            }
            head = head.next;
        }
        return palindrome;
    }
}