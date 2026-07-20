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
        int sum=(l1.val+l2.val);
        int c=sum/10;
        ListNode temp=new ListNode(sum%10);
        ListNode head=temp;
        
        while(l1.next!=null||l2.next!=null){
            if(l1.next!=null&&l2.next!=null){
            l1=l1.next;
            l2=l2.next;
            sum=(l1.val+l2.val)+c;
            c=sum/10;
            ListNode temp2=new ListNode(sum%10);
            temp.next=temp2; 
            temp=temp2;}
            else if(l1.next!=null){
                  l1=l1.next; 
                  sum=l1.val+c;
                  c=sum/10;
                  ListNode temp2=new ListNode(sum%10);
                  temp.next=temp2; 
                  temp=temp2;
            }else{
                 l2=l2.next; 
                  sum=l2.val+c;
                  c=sum/10;
                  ListNode temp2=new ListNode(sum%10);
                  temp.next=temp2; 
                  temp=temp2;
            }
        }
        if(c>0){
            ListNode temp2=new ListNode(c);
                  temp.next=temp2; 
                  temp=temp2;
        }
        return head;
    }
}