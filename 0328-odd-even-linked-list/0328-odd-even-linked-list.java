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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode co = head; //1
        ListNode ce = head.next; //2
        ListNode even = ce;
        while(ce!=null && ce.next!=null){
            ListNode temp = ce.next; //3 //5
            co.next = temp; //1->3 //3->5
            ce.next = temp.next; //2->4 //4->null
            co = co.next; //3 //5
            ce = ce.next; //4 //null
        }
        co.next = even;
        return head;
    }
}