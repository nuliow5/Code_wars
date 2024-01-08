package lt.gerasimovas.simple_tasks.node;

public class Solution {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null){
            if (current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
