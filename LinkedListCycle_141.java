package leetcode;

public class LinkedListCycle_141 {

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
	
	public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            if(fast.next.next==null)
                return false;
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
                return true;
        }
        return false;
    }

}
