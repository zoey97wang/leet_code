package leetcode;

public class RemoveDuplicatesfromSortedList_83 {

	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesfromSortedList_83 r = new RemoveDuplicatesfromSortedList_83();
		ListNode l1 = r.new ListNode(1);
		ListNode l2 = r.new ListNode(1);
		l1.next = l2;
		ListNode head = l1;
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	 

	 public ListNode deleteDuplicates(ListNode head) {
		 if(head==null||head.next==null)
		        return head;
		        ListNode dummy = new ListNode(0);
		        dummy.next = head;
		        head = dummy;
		        while(head.next!=null&&head.next.next!=null){
		            if(head.next.val == head.next.next.val){
		                head.next = head.next.next;
		            }else{
		                head = head.next;
		            }
		        }
		        return dummy.next;
	 }    

}
