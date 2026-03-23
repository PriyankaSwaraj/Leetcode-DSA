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
    ListNode head1=l1,head2=l2;
    ArrayList<Integer> nums1=new ArrayList<>();
    ArrayList<Integer> nums2=new ArrayList<>();
    while(head1!=null)
    {
        nums1.add(head1.val);
        head1=head1.next;
    }
    while(head2!=null)
    {
        nums2.add(head2.val);
        head2=head2.next;
    }
    ArrayList<Integer> result=new ArrayList<>();
    int n=nums1.size(),m=nums2.size();
    int carry=0,i;
    for(i=0;i<n&&i<m;i++)
    {
        int num=nums1.get(i)+nums2.get(i)+carry;
        result.add(num%10);
        carry=num/10;
    }
    for(int j=i;j<n;j++)
    {
        int num=nums1.get(j)+carry;
        result.add(num%10);
        carry=num/10;
    }
    for(int j=i;j<m;j++)
    {
        int num=nums2.get(j)+carry;
        result.add(num%10);
        carry=num/10;
    }
    if(carry>0)
    result.add(carry);
    l1.val=result.get(0);
    ListNode temp=l1;
    int k=result.size();
    for(int j=1;j<k;j++)
    {
        temp.next=new ListNode(result.get(j));
        temp=temp.next;
    }
    return l1;
    }
}