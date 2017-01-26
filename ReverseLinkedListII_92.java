package leetcode;

public class ReverseLinkedListII_92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class ListNode {
		   int val;
		   ListNode next;
		   ListNode(int x) { val = x; }
		  }
	
	 public ListNode reverseBetween(ListNode head, int m, int n) {
	        ListNode dummy = new ListNode(1);
	        dummy.next = head;
	        head = dummy;
	        for(int i=1;i<m;i++){
	            if(head == null)
	                return null;
	            head = head.next;
	        }
	        ListNode prem = head;
	        ListNode mNode = head.next;
	        ListNode nNode = mNode;
	        ListNode postn = mNode.next;
	        for(int i=m;i<n;i++){
	            if(postn == null)
	                return null;
	            ListNode temp = postn.next;
	            postn.next = nNode;
	            nNode = postn;
	            postn = temp;
	        }
	        mNode.next = postn;
	        prem.next = nNode;
	        return dummy.next;
	    }	

}
