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
        int tens = 0;
        ListNode previousNode = null;
        ListNode node = null;
        
        while (true)
        {
            if (tens > 0){}
            else if (l1 == null && l2 == null)
            {
                break;
            }
            
            ListNode newNode = new ListNode(tens, null);
            
            if (l1 != null)
            {
                newNode.val += l1.val;
            }
            
            if(l2 != null)
            {
                newNode.val += l2.val;
            }
            
            if (newNode.val >= 10)
            {
                tens = 1;
                newNode.val %= 10;
            }
            else 
            {
                tens = 0;
            }
            
            if (previousNode == null)
            {
                node = previousNode = newNode;
            }
            else
            {
                previousNode.next = newNode;
                previousNode = newNode;
            }
            
            if (l1 != null)
            {
                l1 = l1.next;
            }
            
            if (l2 != null)
            {
                l2 = l2.next;
            }
        }
        
        return node;
    }
}