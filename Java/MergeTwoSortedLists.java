public class MergeTwoSortedLists {
  public static void main(String args[]){
    // Test Variables
    ListNode n1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode n2 = new ListNode(1, new ListNode(3, new ListNode(4)));

    // Tests
    stringify(n1);
    System.out.print(" + ");
    stringify(n2);
    System.out.print(" = ");
    stringify(mergeTwoLists(n1, n2));
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
    ListNode first = new ListNode(-1), cur = first;

    while(l1 != null && l2 != null){
      if(l1.val < l2.val){
        cur.next = l1;
        l1 = l1.next;
      }else{
        cur.next = l2;
        l2 = l2.next;
      }
      cur = cur.next;
    }

    if(l1 != null){cur.next = l1;}
    else if(l2 != null){cur.next = l2;}
    
    return first.next;
  }

  public static void stringify(ListNode n){
    System.out.print("[");
    while(n != null){
      System.out.print(n.val);
      if(n.next != null){
        System.out.print(", ");
      }
      n = n.next;
    }
    System.out.print("]");
  }
}

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}