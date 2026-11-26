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
        ListNode dummyUniq = new ListNode(101);
        ListNode dummyDup = new ListNode(101);

        ListNode pUniq = dummyUniq;
        ListNode pDup = dummyDup;

        ListNode p = head;

        while(p != null){

            if(p.next != null && p.val == p.next.val || p.val == pDup.val){
                pDup.next = p;
                pDup = pDup.next;
            }else{ 
                pUniq.next = p;
                pUniq = pUniq.next;
            }
            p = p.next;

        pUniq.next = null;
        pDup.next = null;
        }
        
        
        return dummyUniq.next;
    }
}