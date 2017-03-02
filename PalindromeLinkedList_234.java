package leetcode;

public class PalindromeLinkedList_234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        else if(head.next.next==null){
            if(head.val == head.next.val)
                return true;
        }
        int length = 0;
        ListNode getlength = new ListNode(0);
        ListNode dummy1 = new ListNode(0);
        ListNode temp = new ListNode(0);
        dummy1 = head.next;
        getlength.next = head;
        while(getlength.next!=null){
            length++;
            getlength.next = getlength.next.next;
        }
        int half = length/2;
        int middle = length%2;
        int counter = 1;
        while(counter<half){
            temp = dummy1.next;
            dummy1.next = head;
            head = dummy1;
            dummy1 = temp;
            counter++;
        }
        if(middle==0){
            while(dummy1!=null){
                if(head.val!=dummy1.val)
                    return false;
                head = head.next;
                dummy1 = dummy1.next;
            }
        }else if(middle == 1){
            while(dummy1.next!=null){
                if(head.val!=dummy1.next.val)
                    return false;
                head = head.next;
                dummy1 = dummy1.next;
            }
        }
        return true;
    }

}
