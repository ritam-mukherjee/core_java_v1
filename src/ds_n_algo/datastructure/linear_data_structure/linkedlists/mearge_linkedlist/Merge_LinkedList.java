package ds_n_algo.datastructure.linear_data_structure.linkedlists.mearge_linkedlist;

class ListNode {

    /*the class having two property:
        a. data-> which represent the containing value of the element
        b. next-> reference of next element.*/
    int val;
    ListNode next;

    /*It should have one constructor so that at the time of Node creation providing value is mandatory*/
    public ListNode(int val) {
        this.val = val;
        next=null;
    }

}
public  class Merge_LinkedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;

        while(l1!=null||l2!=null){
            if(l1!=null&&l2!=null){
                if(l1.val < l2.val){
                    p.next = l1;
                    l1=l1.next;
                }else{
                    p.next=l2;
                    l2=l2.next;
                }
                p = p.next;
            }else if(l1==null){
                p.next = l2;
                break;
            }else if(l2==null){
                p.next = l1;
                break;
            }
        }

        return head.next;
    }
    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + "-> ");
            node = node.next;
        }
        System.out.print( "NULL");
    }

    public static void main(String[] args) {
        ListNode headA=new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);


        ListNode headB=new ListNode(1);
        headB.next = new ListNode(2);
        headB.next.next = new ListNode(3);
        headB.next.next.next = new ListNode(4);
        ListNode headC=mergeTwoLists(headA,headB);

         printList(headC);
    }
}
