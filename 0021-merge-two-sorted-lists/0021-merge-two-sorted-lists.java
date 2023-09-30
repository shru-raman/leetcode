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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode result = new ListNode();
        ListNode dummy = result;
        while(head1!=null && head2!=null){
            if(head1.val <=head2.val){
                result.next = head1;
                head1 = head1.next;
            } else {
                result.next = head2;
                head2 = head2.next;
            }
            result = result.next;
        }

        if(head1 !=null){
            result.next = head1;
        }
        if(head2!=null){
            result.next = head2;
        }
        return dummy.next;
    }
}