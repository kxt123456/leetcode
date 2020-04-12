package subject;

public class 列表是否有环 {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            if (fast.equals(slow)) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
