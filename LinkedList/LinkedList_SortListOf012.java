// sort LL of 0, 1, 2
class Node {
    int data; Node next;
    Node(int data) {
        this.data=data;
        this.next=null; } }
class LinkedList {
    Node head;
    public Node sortLL(Node head) {
        // 2 -> 1 -> 0 -> 2-> 1 -> 0 -> 2
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);
        Node zero = zeroDummy, one = oneDummy, two = twoDummy;
        Node temp = head;
        while(temp != null) {
            if(temp.data == 0) {
                zero.next = temp;
                zero=zero.next;
                temp=temp.next;
            } else if(temp.data == 1) {
                one.next = temp;
                one=one.next;
                temp=temp.next;
            } else {
                two.next = temp;
                two=two.next;
                temp=temp.next;
            }
        }
        // zeroDummy: -1 -> 0 -> 0
        // oneDummy: -1 -> 1 -> 1
        // twoDummy: -1 -> 2 -> 2 -> 2
        
        //check if oneDummy is not null then connect zeroDummy to oneDummy
        // if oneDummy is null then connect zeroDummy to twoDummy
        if(oneDummy.next != null) {
            zero.next = oneDummy.next;
        } else {
            zero.next = twoDummy.next;
        }
        if(twoDummy.next != null) one.next = twoDummy.next;
        else one.next = null;
        two.next = null;
        
        Node newHead = zeroDummy.next;
        return newHead;
    }

    // printing the list
    public void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class LinkedList_SortListOf012 {
    public static void main(String[] args) {
        Node n1 = new Node(2);
        n1.next = new Node(1);
        n1.next.next = new Node(0);
        n1.next.next.next = new Node(2);
        n1.next.next.next.next = new Node(1);
        n1.next.next.next.next.next = new Node(0);
        n1.next.next.next.next.next.next = new Node(2);

        LinkedList ll = new LinkedList();
        ll.head = n1;
        Node news = ll.sortLL(n1);
        ll.display(news);

    }
}