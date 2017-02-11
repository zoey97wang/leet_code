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
	
	public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode la = headA;
        ListNode lb = headB;
        while(la!=lb){
            if(la==null)
                la = headB;
            else
                la = la.next;
            if(lb==null)
                lb = headA;
            else
                lb = lb.next;
        }
        return la;
    }
	
	public int length(ListNode head){
		int result=0;
		while(head!=null){
			result++;
			head = head.next;
		}
		return result;
	}
	
	public ListNode getIntersectionNode3(ListNode headA, ListNode headB){
		int lengthA = length(headA);
		int lengthB = length(headB);
		while(lengthA>lengthB){
			headA=headA.next;
			lengthA--;
		}
		while(lengthB>lengthA){
			headB=headB.next;
			lengthB--;
		}
		while(headA!=headB){
			headA = headA.next;
			headB = headB.next;
		}
		return headA;
	}

}
