package leetcode;

import leetcode.LinkedListCycle_141.ListNode;

public class IntersectionofTwoLinkedLists_160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) {
			 val = x;
		 	 next = null;
		 }
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode la = headA;
        ListNode lb = headB;
        while(la!=null && lb!=null){
            if(la==lb){
                return la;
            }else if(la.val<lb.val)
                la = la.next;
            else
                lb = lb.next;
        }
        return null;
    }

}
