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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode previousNode = null;
        ListNode node = null;
        
        while (l1 != null || l2 != null || carry > 0)
        {
            int l1Val = (l1 != null) ? l1.val : 0;
            int l2Val = (l2 != null) ? l2.val : 0;
            int sum = carry + l1Val + l2Val;
            carry = sum / 10;
            
            ListNode newNode = new ListNode(sum % 10);
            
            if (previousNode == null)
            {
                node = previousNode = newNode;
            }
            else
            {
                previousNode.next = newNode;
                previousNode = newNode;
            }
            
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        
        return node;
    }
}