package leetcode;

public class DeleteNodeinaLinkedList_237 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}

	public void deleteNode(ListNode node) {
        while(node.next!=null){
            node.val = node.next.val;
            if(node.next.next == null)
                node.next = null;
            else
                node = node.next;
        }
        node = null;
    }
	
	public void deleteNode2(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
