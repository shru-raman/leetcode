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
        
        ListNode prev = head;
        ListNode cur = head;

        while(cur!=null){
            cur = cur.next;
            while(cur!=null && cur.val==prev.val){
                cur = cur.next;
            }
            prev.next = cur;
            prev = cur;
        }
        return head;
    }
}