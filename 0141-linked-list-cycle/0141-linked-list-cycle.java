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
    public boolean hasCycle(ListNode head) {
        if(null == head){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && slow != fast){
            slow = slow.next;
            fast = fast.next;
            if(fast!=null) {
                fast = fast.next;
            }
        }
        return slow == fast;
    }
}