package leetcode;

public class RemoveLinkedListElements_203 {
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public ListNode removeElements(ListNode head, int val) {
        ListNode fake1 = new ListNode(0);
        ListNode fake2 = new ListNode(0);
        fake2.next = head;
        fake1.next = fake2;
        while(fake2!=null&&head!=null){
            if(head.val == val)
                {fake2.next = head.next;
                head = head.next;}
            else{
            fake2 = fake2.next;
            head = head.next;
            }
        }
        return fake1.next.next;
    }
	
	public ListNode removeElements2(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

}
